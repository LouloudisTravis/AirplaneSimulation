import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Louloudis_GUI {
	
	//Graphical User Interface will hold all information regarding
	// the interface used by the client.
	
	//initialize the Louloudis_Manage object to manipulate data
	private Louloudis_ManageSeats manager = new Louloudis_ManageSeats();
	
	//Creating all the boxes and buttons used in the GUI
	private Pane root = new Pane();	
	
	private HBox topBox = new HBox();
	private HBox bottomBox = new HBox();	
	
	private VBox layoutseats = new VBox();
	private VBox layoutattendent = new VBox();
	private VBox finalBox = new VBox();
	private VBox seatOne = new VBox();
	private VBox seatTwo = new VBox();
	private VBox seatThree = new VBox();
	private VBox seatFour = new VBox();
	private VBox seatFive = new VBox();	
	private VBox seatAttendant = new VBox();	
	
	private Text seats = new Text();
	private Text attendant = new Text();	
	
	private Button callAttendant1 = new Button("Seat 1 Call");
	private Button callAttendant2 = new Button("Seat 2 Call");
	private Button callAttendant3 = new Button("Seat 3 Call");
	private Button callAttendant4 = new Button("Seat 4 Call");
	private Button callAttendant5 = new Button("Seat 5 Call");
	private Button clearCalls = new Button("Clear All");

	public Louloudis_GUI() 
	{
	}
	
	
	/*
	 * The createGUI method will be used by the object created in Louloudis_Main
	 * to create our graphical user interface, and @return 
	 * the built Pane to the scene to display on the stage.
	 */
	public Pane createGUI() {
		
	// Setting up the Top of the GUI to have Text
		seats.setText("Passenger Seat call light 1-5");
		seats.setTranslateX(150);
			
	// Assigning seats there respective Vertical boxes		
		seatOne.getChildren().addAll(manager.getSeatOne(), callAttendant1);
		seatTwo.getChildren().addAll(manager.getSeatTwo(), callAttendant2);
		seatThree.getChildren().addAll(manager.getSeatThree(), callAttendant3);
		seatFour.getChildren().addAll(manager.getSeatFour(), callAttendant4);
		seatFive.getChildren().addAll(manager.getSeatFive(), callAttendant5);
		
		
		seatOne.setSpacing(10);
		seatTwo.setSpacing(10);
		seatThree.setSpacing(10);
		seatFour.setSpacing(10);
		seatFive.setSpacing(10);
		
		
	//Building the "seats" in the GUI as circles auto filled with Blue for Passengers.
		topBox.getChildren().addAll(seatOne, seatTwo, seatThree, seatFour, seatFive);
		
		topBox.setTranslateX(45);
		topBox.setSpacing(10);
		
	// Setting up the Top of the GUI to have Text : Explaining what your looking at.
		attendant.setText("Attendant Button");
		attendant.setTranslateX(150);
			
		seatAttendant.getChildren().addAll(manager.getAttendantSeat(), clearCalls);
		
		seatAttendant.setTranslateX(135);
		seatAttendant.setSpacing(10);
		
	// Building the bottom of the GUI to have our Attendant circle controlling.
		bottomBox.getChildren().add(seatAttendant);
		bottomBox.setPadding(new Insets(15,15,15,15));
			
	//adding top half to vertical box.
		layoutseats.getChildren().addAll(seats, topBox);
		
		layoutseats.setSpacing(5);
		layoutseats.setTranslateY(35);
		
	//adding bottom half to vertical box
		layoutattendent.getChildren().addAll(attendant, bottomBox);
			
		layoutattendent.setTranslateY(50);
		
	//adding top and bottom halves to vertical box
		finalBox.getChildren().addAll(layoutseats, layoutattendent);
			
			
	//giving our final root Pane that final vertical box
		root.getChildren().add(finalBox);
		root.setPrefSize(500, 500);
	
	//Giving our buttons there call to action.
		callAttendant1.setOnAction(e ->{
			manager.turnOn((manager.getSeatOne()));
			});
		callAttendant2.setOnAction(e ->{
			manager.turnOn(manager.getSeatTwo());
			});
		callAttendant3.setOnAction(e ->{
			manager.turnOn(manager.getSeatThree());
			});
		callAttendant4.setOnAction(e ->{
			manager.turnOn(manager.getSeatFour());
			});
		callAttendant5.setOnAction(e ->{
			manager.turnOn(manager.getSeatFive());
			});
		
		clearCalls.setOnAction(e ->{
			manager.turnOffAll(manager.getSeatOne(), manager.getSeatTwo(), manager.getSeatThree(),
					manager.getSeatFour(), manager.getSeatFive());			
		});
		//returning our root Pane with our completed GUI
		return root;
	}
}
