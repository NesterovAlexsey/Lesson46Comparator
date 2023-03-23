//# Задача 1
//Используйте класс `Book` (книга) из предыдущего домашнего задания.
//
//Создайте компаратор, который позволит сортировать книги по названию,
// при одинаковых названиях - по автору (и там, и там - по алфавиту)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainBook {
  public static void main(String[] args) {

    List<Book> myBestBook = new ArrayList<>();
    myBestBook.add(new Book("Remark", "Three friends", 200));
    myBestBook.add(new Book("Stephen Covey", "7 Effective skills", 300));
    myBestBook.add(new Book("Достоевский", "Братья Карамазовы", 680));
    myBestBook.add(new Book("Remark", "No change on the western front", 300));

    System.out.println("Sort by Author(in alphabet):");
    Collections.sort(myBestBook);
    showBookList(myBestBook);

    System.out.println("Sort by Book name(in alphabet):");
    myBestBook.sort(new NameBookComparator());
    showBookList(myBestBook);
  }

  private static void showBookList(List<Book> myBestBook) {
    for (Book book : myBestBook) {
      System.out.println(book);
    }
    System.out.println();
  }
}