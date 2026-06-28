class Library {

    // This variable stores the only object of the class
    private static Library obj;

    // Private constructor so that no one can create an object directly
    private Library() {
        System.out.println("Library has been opened.");
    }

    // This method returns the same object every time
    public static Library getInstance() {

        if (obj == null) {
            obj = new Library();
        }

        return obj;
    }

    // Display library information
    public void showLibrary() {
        System.out.println("Library Name : Anna Library");
        System.out.println("Location     : Chennai");
        System.out.println("Open Time    : 9.00 AM");
    }

    // Issue a book
    public void issueBook(String book) {
        System.out.println(book + " has been issued.");
    }

    // Return a book
    public void returnBook(String book) {
        System.out.println(book + " has been returned.");
    }
}

public class Main {

    public static void main(String[] args) {

        // First time accessing the library
        Library first = Library.getInstance();

        first.showLibrary();
        System.out.println();

        first.issueBook("Java Programming");
        System.out.println();

        // Accessing the library again
        Library second = Library.getInstance();

        second.returnBook("Java Programming");
        System.out.println();

        // Checking whether both references are the same
        if (first == second) {
            System.out.println("Only one Library object is created.");
        } else {
            System.out.println("More than one object is created.");
        }
    }
}