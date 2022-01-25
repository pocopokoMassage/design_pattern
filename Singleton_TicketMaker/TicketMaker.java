public class TicketMaker
{
	private static TicketMaker tm1 = new TicketMaker(1000);
	private static TicketMaker tm2 = new TicketMaker(2000);
	private static TicketMaker tm3 = new TicketMaker(3000);
	private int ticket;
	
	private TicketMaker(int ticketNumber)
	{
		this.ticket = ticketNumber;
	}
	
	public int getNextTicketNumber()
	{
		return ticket++;
	}
	
	public static TicketMaker getInstance(String insNumber)
	{
		if(insNumber == "ALPHA")
		{
			return tm1;
		}
		else if(insNumber == "BETA")
		{
			return tm2;
		}
		else if(insNumber == "GAMMA")
		{
			return tm3;
		}
		else
		{
			System.out.println("cannot find the instance: " + insNumber );
		}
		return null;
	}
}
