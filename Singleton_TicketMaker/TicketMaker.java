public class TicketMaker
{
	private static TicketMaker tm = new TicketMaker(1000);
	private int ticket;
	
	private TicketMaker(int ticketNumber)
	{
		this.ticket = ticketNumber;
	}
	
	public int getNextTicketNumber()
	{
		return ticket++;
	}
	
	public static TicketMaker getInstance()
	{
		return tm;
	}
}
