
import java.awt.print.Book;

Define Max10;
/* 
1. Make a library management system 
2. Create a class library
2. Methods: Issuebook, Returnbook, ShowAvailableBook, AddBook 
3. Properties:  array to store the available books 
4. Array to store the issued books 

 */

class Library {
    String[] books = new String[5];
    int count = 0;

    void AddBook(String book) {
        books[count] = book;
        count++;
        System.out.println("Book added successfully");
    }

    String ShowAvailableBook() {
        System.out.println("Available Books in the Library are: ");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    }

    void IssueBook(String Book) {
        for (int i = 0; i < count; i++) {
            if (books[i].equals(book)) {
                System.out.println(book + " issued");
                books[i] = null;
                return;
            }
        }
        System.out.println("Book not available. ");
    }

    void ReturnBook(String book) {
        books[count] = book;
        count++;
        System.out.println("Book is returned. ");
    }

}

public class hello {
    int[] IssuedBook;
    String[] ShowAvailableBook;
}
