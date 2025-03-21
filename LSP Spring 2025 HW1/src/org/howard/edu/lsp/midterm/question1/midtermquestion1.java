package org.howard.edu.lsp.midterm.question1;

/**
* Midterm question 1
Book class 
– this class is needed to hold/represent individual books in the library via aspects like the book title, ISBN, etc.
Responsibilities: The Book class contains and maintains the individual details of each book (i.e. the title, author, ISBN and availability status)
Collaborators: Member class

Member class
– this class is needed to track the number of books each member borrows at a time and to provide book availability information.
Responsibilities: The Member class tracks which book and the number of books a member has borrowed, ensuring that it does not surpass 3 books at a time. It also updates a book’s availability once the member returns the book.

Collaborators: Book class, Library System class

Librarian class
– this class is needed to manage the library’s collection of books.
Responsibilities: The Librarian class adds new books to the collection and removes books that are outdated and/or lost.
Collaborators: N/A

Library System class 
– this class is needed to connect all other classes in their functions
Responsibilities: The Library System class displays the list of available books in the library and manages the process of borrowing and returning books. It will also track which member borrowed which book.
Collaborators: Book class, Member class, Librarian class
*/
