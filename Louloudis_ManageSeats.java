import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Louloudis_ManageSeats {

	

	
	//circle and seat objects being created and bonded to make GUI seats
	
	private Louloudis_Seat s1 = new Louloudis_Seat();
	private Louloudis_Seat s2 = new Louloudis_Seat();
	private Louloudis_Seat s3 = new Louloudis_Seat();
	private Louloudis_Seat s4 = new Louloudis_Seat();
	private Louloudis_Seat s5 = new Louloudis_Seat();
	
	private Louloudis_Seat sa = new Louloudis_Seat();
	
	private Circle c1 = new Circle();
	private Circle c2 = new Circle();
	private Circle c3 = new Circle();
	private Circle c4 = new Circle();
	private Circle c5 = new Circle();
	
	private Circle a1 = new Circle();
	
	//boolean to check whether the button has been pressed
	private boolean lightcheck = false;
		
	public Louloudis_ManageSeats()
	{		
	}
	
	//Getter method's for selecting the correct seat to manipulate
	
	public Circle getSeatOne()
	{
		return s1.seatCreate(c1);
	}
	public Circle getSeatTwo()
	{
		return s2.seatCreate(c2);
	}
	public Circle getSeatThree()
	{
		return s3.seatCreate(c3);
	}
	public Circle getSeatFour()
	{
		return s4.seatCreate(c4);
	}
	public Circle getSeatFive()
	{
		return s5.seatCreate(c5);
	}
	
	public Circle getAttendantSeat()
	{
		return sa.attendantCreate(a1);
	}
	
	//Turn on light method, to switch call from red to green.
	public void turnOn(Circle c)
	{		
			if (lightcheck = true) {
				c.setFill(Color.GREEN);
			}
		}
	
	
	//Turn off all, switching all green lights back to default red.
	public void turnOffAll(Circle c1, Circle c2, Circle c3, Circle c4, Circle c5)
	{								
				c1.setFill(Color.RED);
				c2.setFill(Color.RED);
				c3.setFill(Color.RED);
				c4.setFill(Color.RED);
				c5.setFill(Color.RED);		
	}

}
