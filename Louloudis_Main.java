import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


// Author Name: Travis Louloudis
// Date: 1/7/2018
//Program Name: Louloudis_Airplane
//Purpose: Simulation using "call" button, call attendant. (with GUI representation)


public class Louloudis_Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		Louloudis_GUI airplane = new Louloudis_GUI();
		
		
		Scene scene = new Scene(airplane.createGUI());
		
		stage.setTitle("Louloudis Airplane 'Call Attendant' Simulation");
		stage.setScene(scene);
		stage.show();		
	}
	
	public static void main(String[] args) {
		launch(args);
}
	

}