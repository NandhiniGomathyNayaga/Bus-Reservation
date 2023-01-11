package bus.reservation.system;

public class TicketBookingThread extends Thread{
	
	private TicketCounter ticketcounter;
	private String passengername;
	private int noofseatstobook;

	public TicketBookingThread(TicketCounter ticketcounter, String passengername, int noofseatstobook) {
		this.ticketcounter= ticketcounter;
		this.passengername= passengername;
		this.noofseatstobook = noofseatstobook;
	}

	public void start() {
		ticketcounter.bookticket(passengername, noofseatstobook);
	}

}

