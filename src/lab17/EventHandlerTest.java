package lab17;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EventHandlerTest extends Application{ 
        
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        Button buttonOK = new Button("OK");
        buttonOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("You pressed OK");
            }
        });
        
        Button buttonCancel = new Button("Cancel");
        buttonCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        
        Pane pane = new FlowPane();
        Scene scene = new Scene(pane);
        pane.getChildren().add(buttonOK);
        pane.getChildren().add(buttonCancel);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    } 

}
