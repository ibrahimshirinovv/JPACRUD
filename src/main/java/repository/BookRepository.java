package repository;
import model.Book;

public interface BookRepository {



    void save(Book book);
    Book find(int id);
    Book update(Book book);
    void delete(Book book);
}
