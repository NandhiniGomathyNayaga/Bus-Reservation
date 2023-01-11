package bus.reservation.client;
import bus.reservation.system.TicketBookingThread;
import bus.reservation.system.TicketCounter;
public class Test {

	public static void main(String[] args) {
		TicketCounter ticketcounter=new TicketCounter();
		TicketBookingThread t1=new TicketBookingThread(ticketcounter,"Malathy",2);
		TicketBookingThread t2=new TicketBookingThread(ticketcounter,"Kirthi",2);
		
		t1.start();
		t2.start();
	}

}
