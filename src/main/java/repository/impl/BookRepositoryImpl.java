package repository.impl;

import jpaFactory.JpaFactory;
import jpaFactory.impl.JpaFactoryImpl;
import model.Book;
import repository.BookRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class BookRepositoryImpl implements BookRepository {

    private JpaFactory jpaFactory = new JpaFactoryImpl();
    private EntityManager entityManager = jpaFactory.getEntityManager();
    private EntityTransaction transaction = jpaFactory.getEntityTransaction();


    @Override
    public void save(Book book) {
        transaction.begin();
        entityManager.persist(book);
        transaction.commit();
    }

    @Override
    public Book find(int id) {

        Book book = entityManager.find(Book.class,id);

        if (book != null) {
            return book;
        }
        return null;
    }

    @Override
    public Book update(Book book) {

        transaction.begin();

        Book updatedBook = entityManager.merge(book);

        transaction.commit();
        return updatedBook;
    }

    @Override
    public void delete(Book book) {

        transaction.begin();
        entityManager.remove(book);
        transaction.commit();

    }
}
