
import java.util.Scanner;
import java.util.SplittableRandom;

public class User {
    String name;
    int numberTicket;
    String faculty;
    String birthday;
    String phoneNumber;
    int end = 0;
    String[] books;


    public User() {
    }

    public User(String name, int numberTicket, String faculty, String birthday, String phoneNumber) {
        this.name = name;
        this.numberTicket = numberTicket;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.books = new String[10];
    }


    public void print() {
        System.out.println(name + " " + numberTicket + " " + faculty + " " + birthday + " " + phoneNumber);
    }

    public void takeBook(String bookName) {
        books[end++] = bookName;
        System.out.println("Вы успешно взяли книгу " + bookName);
    }

    public void returnBook(String bookName) {
        findBook(bookName);
        System.out.println("Вы успешно вернули книгу");
    }

    private void findBook(String bookName) {
        for (int i = 0; i < end; i++) {
            if (books[i].equals(bookName)) {
                deleteBook(i);
                break;
            }
        }
    }

    private void deleteBook(int i) {
        for (int j = i; j < end; j++) {
            books[j] = books[j + 1];
        }
        end--;
    }
}