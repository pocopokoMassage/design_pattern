import java.util.Iterator;

public class Main
{
	public static void main(String[] args)
	{
		BookShelf bookshelf = new BookShelf(4);
		bookshelf.appendBook(new Book("book1"));
		bookshelf.appendBook(new Book("book2"));
		bookshelf.appendBook(new Book("book3"));
		bookshelf.appendBook(new Book("book4"));
		
		Iterator<Book> it = bookshelf.iterator();
		while(it.hasNext())
		{
			Book book = it.next();
			System.out.println(book.getName());
		}
		System.out.println();
		
		for (Book book : bookshelf)
		{
			System.out.println(book.getName());
		}
		System.out.println();
	}
}
