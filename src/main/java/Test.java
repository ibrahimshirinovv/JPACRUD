import model.Book;
import repository.BookRepository;
import repository.impl.BookRepositoryImpl;

import java.util.Calendar;
import java.util.Date;

public class Test {


    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepositoryImpl();

//------------------------------------------------------------------------------------------------------------------------------------
                            //SAVE BOOK
       /* Date publisherDate = customDate(26,06,1997);
        Date publisherDate2 = customDate(26,4,1999);
        Book book = new Book(100,"Harry Potter",450,"Novel","J. K. Rowling",publisherDate);
        Book book2 = new Book(101,"The Alchemist",560,"Novel","Paulo Coelho",publisherDate2);

        bookRepository.save(book);
        bookRepository.save(book2);*/

//------------------------------------------------------------------------------------------------------------------------------------
                    //FIND BOOK
      /* Book book =  bookRepository.find(101);

        System.out.println(book);*/

//------------------------------------------------------------------------------------------------------------------------------------
                        //UPDATE BOOK

      /*  Book book =  bookRepository.find(101);
        book.setPageCount(555);
        bookRepository.update(book);*/
//------------------------------------------------------------------------------------------------------------------------------------

       Book book =  bookRepository.find(101);
        bookRepository.delete(book);

    }

    public static Date customDate(int day, int month,int year){

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH,day);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.YEAR,year);

        return calendar.getTime();
    }
}
