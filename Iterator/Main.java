

public class Main
{
	public static void main(String[] args)
	{
		BookShelf bookshelf = new BookShelf(4);
		bookshelf.appendBook(new Book("book1"));
		bookshelf.appendBook(new Book("book2"));
		bookshelf.appendBook(new Book("book3"));
		bookshelf.appendBook(new Book("book4"));
		
		System.out.println(bookshelf.getLength());
		System.out.println(bookshelf.getBookAt(2).getName());
	}
}
