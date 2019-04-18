package lab17;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Mouse extends Application{ 
        
    @Override
    public void start(Stage primaryStage) throws Exception {
        //create pane
           Pane pane = new Pane();
           Text text = new Text(20, 20, "Programming is fun");
           pane.getChildren().addAll(text);
           text.setOnMouseDragged(new EventHandler<MouseEvent>() {
               @Override
               public void handle(MouseEvent event) {
                   text.setX(event.getX());
                   text.setY(event.getY());
               }
           });
        
        
        Scene scene = new Scene(pane, 300, 100);
        primaryStage.setTitle("MouseEventDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
        
       
        
    }
    public static void main(String[] args) {
        launch(args);
    }

}

