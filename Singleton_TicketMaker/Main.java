public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Start.");
		TicketMaker obj1 = TicketMaker.getInstance();
		TicketMaker obj2 = TicketMaker.getInstance();
		if(obj1 == obj2)
		{
			System.out.println("obj1 and obj2 are same");
		}
		else
		{
			System.out.println("obj1 and obj2 are different");
		}
		System.out.println("End.");
	}
}
