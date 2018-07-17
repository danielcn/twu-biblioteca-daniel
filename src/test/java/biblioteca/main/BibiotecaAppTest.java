package biblioteca.main;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class BibiotecaAppTest {

    private BibliotecaApp bibliotecaApp;
    private Library library;

    @Before
    public void setUp(){
        bibliotecaApp = new BibliotecaApp();
        library = new Library();
    }

    @Test
    public void testWelcomeMessage() {
        String welcome =  bibliotecaApp.welcomeMessage();
        assertEquals("Welcome Message", welcome);
    }
//
//    @Test
//    public void testReturnBook(){
//        Book bookExpected = new Book("Harry Potter");
//        Book bookActual = library.findBook(bookExpected);
//        assertEquals(bookExpected, bookActual);
//    }
//
//    @Test
//    public void testReturnBookSuccessful(){
//        Book bookExpected = new Book("Harry Potter");
//        Book bookActual = library.findBook(bookExpected);
//        if(bookActual != null) {
//            String sucessBookReturnMessage =  bibliotecaApp.successfulBookReturn();
//            assertEquals("Thank you for returning the book.", sucessBookReturnMessage);
//        }
//    }
//
//    @Test
//    public void testReturnBookUnsuccessful(){
//        Book bookExpected = new Book("Harry Potter");
//        Book bookActual = library.findBook(bookExpected);
//        if(bookActual != null) {
//            String unsucessBookReturnMessage =  bibliotecaApp.unsuccessfulBookReturn();
//            assertEquals("That is not a valid book to return.", unsucessBookReturnMessage);
//        }
//    }
}
