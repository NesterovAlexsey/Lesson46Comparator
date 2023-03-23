import java.util.Comparator;

public class NumberOfPagesComparator implements Comparator<Book> {

  @Override
  public int compare(Book a, Book b){
    if(a.getNumberOfPages() != b.getNumberOfPages()) {
      return a.getNumberOfPages() - b.getNumberOfPages();
    }
    return a.getBookName().compareTo(b.getBookName());
  }
}
