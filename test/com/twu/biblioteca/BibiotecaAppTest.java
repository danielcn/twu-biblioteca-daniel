package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibiotecaAppTest {

    private BibliotecaApp bibliotecaApp;
    
    @Test
    public void test() {

        bibliotecaApp = new BibliotecaApp();
        String welcome =  bibliotecaApp.welcomeMessage();
        assertEquals("Welcome Message", welcome);
    }
}
