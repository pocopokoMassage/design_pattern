import java.util.Iterator;

public class BookShelf 
{
	private Book[] books;
	private int last;
	
	public BookShelf(int maxsize)
	{
		this.books = new Book[maxsize];
		this.last = 0;
	}
	
	public Book getBookAt(int index)
	{
		return books[index];
	}
	
	public void appendBook(Book book)
	{
		books[last] = book;
		last++;
	}
	
	public int getLength()
	{
		return last;
	}
	
	/*
	@Override
	publice Iterator<Book> iterator()
	{
		return new BookShelfIterator(this);
	}
	*/
}
