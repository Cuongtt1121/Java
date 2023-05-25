package examjava;

import Thihetmon.Author;
import Thihetmon.Book;

public class BookDemo {
    public static void main(String[] args) {
        Thihetmon.Author author1 = new Author("Russel", "Winderand");
        Thihetmon.Book Booknumber1 = new Book(" Developping Java Software "," Russel Winderand ", 79.75);
        System.out.println(Booknumber1);
    }
}
