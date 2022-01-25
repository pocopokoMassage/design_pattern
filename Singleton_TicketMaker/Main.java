public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Start.");
		TicketMaker obj1 = TicketMaker.getInstance("ALPHA");
		TicketMaker obj2 = TicketMaker.getInstance("BETA");
		TicketMaker obj3 = TicketMaker.getInstance("GAMMA");
		TicketMaker obj4 = TicketMaker.getInstance("EMPTY");
		TicketMaker obj5 = TicketMaker.getInstance("GAMMA");
		if(obj1 == obj2)
		{
			System.out.println("obj1 and obj2 are same");
		}
		else
		{
			System.out.println("obj1 and obj2 are different");
		}
		
		if(obj2 == obj3)
		{
			System.out.println("obj2 and obj3 are same");
		}
		else
		{
			System.out.println("obj2 and obj3 are different");
		}
		
		if(obj5 == obj3)
		{
			System.out.println("obj5 and obj3 are same");
		}
		else
		{
			System.out.println("obj5 and obj3 are different");
		}
		
		System.out.println("obj1's next ticket is " + obj1.getNextTicketNumber());
		System.out.println("obj2's next ticket is " + obj2.getNextTicketNumber());
		System.out.println("obj3's next ticket is " + obj3.getNextTicketNumber());
		System.out.println("obj5's next ticket is " + obj5.getNextTicketNumber());
		
		System.out.println("End.");
	}
}
