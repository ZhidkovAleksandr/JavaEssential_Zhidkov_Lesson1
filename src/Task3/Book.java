package Task3;

import java.util.Scanner;

public class Book {

    Author authorOfBook;
    Content contentOfBook;
    Title titleOfBook;

    public Book(){

        this.authorOfBook = new Author();
        this.authorOfBook.setNameOfAuthor(takeTheName());
        this.contentOfBook = new Content();
        this.contentOfBook.setTextOfContent(takeTheName());
        this.titleOfBook = new Title();
        this.titleOfBook.setNameOfTitle(takeTheName());
    }

    public String takeTheName(){

        Scanner textForField = new Scanner(System.in);
        System.out.println("Type in some information");
        return textForField.next();

    }

    public void show(){

        this.authorOfBook.show();
        this.titleOfBook.show();
        this.contentOfBook.show();

    }

    public static void main(String[] args) {
        Book creatingBook = new Book();
        creatingBook.show();
    }
}


