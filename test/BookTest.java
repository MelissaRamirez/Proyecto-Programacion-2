/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.Book;
import file.BookFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Melissa Ramírez R
 */
public class BookTest {

    public BookTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() throws IOException, FileNotFoundException, ClassNotFoundException {

        BookFile bookFile = new BookFile();

        Book book1 = new Book("HarryPotter", "JK Rooling", "fisico", 2001,
               "1234567891234", "libro1", 3);
//
        Book book2 = new Book("HarryPotter", "JK Rooling", "fisico", 2001,
              bookFile.compareid(bookFile.writeID()), "libro2", 0);

       Book book3 = new Book("HarryPotter", "JK Rooling", "fisico", 2001,
           bookFile.compareid(bookFile.writeID()), "libro3", 0);

       Book book4 = new Book("HarryPotter", "JK Rooling", "fisico", 2001,
                bookFile.compareid(bookFile.writeID()), "libro6", 0);

//      bookFile.insertBook(book1);
//      bookFile.insertBook(book2);
//        bookFile.insertBook(book3);
//        bookFile.insertBook(book4);

       // bookFile.read();
       // System.out.println(bookFile.countObject());
       // bookFile.getBookList().toString();
       bookFile.updateBook("3603288870000", "cantidad", "2");
        
        
     //   bookFile.borrarObjeto("1234567891234");

    }
}
