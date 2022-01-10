import java.util.Iterator;
import java.util.ArrayList;

public class BookShelf implements Iterable<Book>
{
	private ArrayList<Book> books;
	private int last;
	
	public BookShelf(int maxsize)
	{
		this.books = new ArrayList<Book>();
		this.last = 0;
	}
	
	public Book getBookAt(int index)
	{
		return books.get(index);
	}
	
	public void appendBook(Book book)
	{
		books.add(book);
		last++;
	}
	
	public int getLength()
	{
		return last;
	}
	
	@Override
	public Iterator<Book> iterator()
	{
		return new BookShelfIterator(this);
	}
	
}
