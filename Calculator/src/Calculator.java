/*******************************************************************************
* Name: Feras
* Description: Create a Calculator GUI
 ******************************************************************************/

//import statements
import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Calculator extends Application{
    @Override//override the start method
    public void start(Stage primaryStage){
        FlowPane pane = new FlowPane();
        pane.setHgap(3);
        pane.setAlignment(Pos.CENTER);
        
        //create text fields and align them
        TextField number1 = new TextField();
        TextField number2 = new TextField();
        TextField result = new TextField();
        number1.setPrefColumnCount(3);
        number2.setPrefColumnCount(3);
        result.setPrefColumnCount(3);
        
        //add text fields and labels to pane
        pane.getChildren().addAll(new Label("Number 1:"), number1,
                new Label("Number 2:"), number2, new Label("Result:"), result);
        
        //create and ImageView 
        ImageView imageView = new ImageView("file:Calculator.png");
        pane.getChildren().add(imageView);//add image to pane
        
        //create an Hbox to contain the 4 buttons
        HBox hBox = new HBox();
        Button btnAdd = new Button("Add");
        Button btnSub = new Button("Subtract");
        Button btnMulti = new Button("Mulitply");
        Button btnDivide = new Button("Divide");
        
        //align the Hbox
        hBox.setAlignment(Pos.BOTTOM_CENTER);
        //add all the buttons to the hbox
        hBox.getChildren().addAll(btnAdd,btnSub,btnMulti,btnDivide);
        
        //create a border pane and assign the Flow pane to it and align it 
        BorderPane borderPane = new BorderPane(pane);
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);
        
        
        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }//end start method
    
    public static void main(String[] args) {
        Application.launch(args);

    }//end main method
}//end class
