import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class TraingleBuilder extends Application {

	public void start(Stage stage) 
	{
		// Triangle code
		
		
		Line line1 = new Line(100,250,400,250);
		Line line2 = new Line(400,250,100,70);
		Line line3 =  new Line (100, 70, 100, 250);
		
		
		Group root = new Group (line1, line2, line3);
		
		Scene scene = new Scene (root, 600, 600);
		
		stage.setScene(scene);
		stage.setTitle("triangle");
		
		stage.show();
		

}

	public static void main (String[] args)
	
	{
		launch(args);
	}
	
}