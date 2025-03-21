package org.howard.edu.lsp.midterm.question2;
// Making class to represent a book in a library system which contains attributes like title, author, ISBN, and the year the book was published

public class Book {
    
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    //Initialising a Book object with title, author, ISBN, and yearPublished.

    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    //For the getters:
    
    
    //Gets the title of the book.
    //Returns the title of the book.
    public String getTitle() {
        return title;
    }

    //Gets the author of the book.
    //Returns the author of the book.
    public String getAuthor() {
        return author;
    }

    //Gets the ISBN of the book.
    //Returns the ISBN of the book.
    public String getISBN() {
        return ISBN;
    }

    //Gets the year the book was published.
    //Returns the year the book was published.
    public int getYearPublished() {
        return yearPublished;
    }

    //For the setters:
    
    
    //Sets the title of the book.
    public void setTitle(String title) {
        this.title = title;
    }

    //Sets the author of the book.
    public void setAuthor(String author) {
        this.author = author;
    }

    //Sets the ISBN of the book.
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    //Sets the year the book was published.
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    //This compares the book to another object and considers two books equal if their ISBN and author are the same.
    //Obj the object to compare this book against.
    //Return true if the books have the same ISBN and author, false otherwise.

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; //If they are the same object
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; //Check if the object is of the same class
        }
        
        Book otherBook = (Book) obj; //Cast the object to Book
        
        //Check if the books' ISBN and author are the same
        return this.ISBN.equals(otherBook.ISBN) && this.author.equals(otherBook.author);
    }

    
    //Returns a string representation of the book in the format:
    //Title: [title], Author: [author], ISBN: [ISBN], Year Published: [yearPublished]
    //Returns a string representing the book.
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}
