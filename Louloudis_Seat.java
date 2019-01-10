import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Louloudis_Seat {

	public Louloudis_Seat() 
	{
	}
	public Circle seatCreate(Circle s) {
		s.setRadius(15);
		s.setFill(Color.RED);
		return s;		
	}
	public Circle attendantCreate(Circle s) {
		s.setRadius(25);
		s.setFill(Color.BLACK);
		return s;
	}
}
