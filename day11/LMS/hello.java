
/* 
1. Make a library management system 
2. Create a class library
2. Methods: Issuebook, Returnbook, ShowAvailableBook, AddBook 
3. Properties:  array to store the available books 
4. Array to store the issued books 

 */

class Library {
    String[] books = new String[5];
    int No_of_books = 0;

    void AddBook(String book) {
        books[No_of_books] = book;
        No_of_books++;
        System.out.println("Book added successfully");
    }

    void ShowAvailableBook() {
        System.out.println("Available Books in the Library are: ");
        for (int i = 0; i < No_of_books; i++) {
            System.out.println(books[i]);
        }
    }

    void IssueBook(String book) {
        for (int i = 0; i < No_of_books; i++) {
            if (books[i].equals(book)) {
                System.out.println(book + " issued");
                books[i] = null;
                return;
            }
        }
        System.out.println("Book not available. ");
    }

    void ReturnBook(String book) {
        books[No_of_books] = book;
        No_of_books++;
        System.out.println(book + " Book is returned. ");
    }

}

public class hello {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.AddBook("Java");
        lib.AddBook("Python");
        lib.AddBook("C++");
        lib.ShowAvailableBook();
        lib.IssueBook("Java");
        lib.ShowAvailableBook();
        lib.ReturnBook("Java");
        lib.ShowAvailableBook();

    }
}