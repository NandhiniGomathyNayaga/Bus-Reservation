package bus.reservation.system;

public class TicketCounter {

	private int availableseats= 3;
	
	public void bookticket(String pname, int numberofseats) {
		if((availableseats >= numberofseats) && (numberofseats>0)) {
			System.out.println("Hi," +pname +":" +numberofseats+"seats booked succesfully");
			availableseats = availableseats - numberofseats;
			
			}else
				System.out.println("Hi," +pname+":Seats not available");
	}

}
