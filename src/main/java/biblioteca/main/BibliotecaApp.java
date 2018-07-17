package biblioteca.main;

import java.util.Scanner;

public class BibliotecaApp {

    private Library library;

    BibliotecaApp(){
        this.library = new Library();
    }

    public void logMessage(String message){
        System.out.println(message);
    }

    public String welcomeMessage() { return  "Welcome Message"; }

    public void mainMenu(){

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            logMessage("Command Options: ");
            logMessage("1: List Books");
            logMessage("0: Quit");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Test");
                    //library.bookDetails(library.getBookList());
                    break;
                case 0:
                    break;
                default:
                    logMessage("Select a valid option!");
                    break;
            }
        } while (choice != 0);
    }

    public String successfulCheckout() { return "Thank you! Enjoy the book."; }

    public String unsucessulCheckout(){ return "That book is not available."; }

    public String successfulBookReturn(){
        return "Thank you for returning the book.";
    }

    public String unsuccessfulBookReturn(){
        return "That is not a valid book to return.";
    }

    public void startApp(){
        String welcomeMessage = welcomeMessage();
        logMessage(welcomeMessage);
        library = new Library();
        mainMenu();
    }

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.startApp();
    }
}
