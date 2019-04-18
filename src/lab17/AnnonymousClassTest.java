package lab17;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AnnonymousClassTest extends Application{ 
        
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button buttonOK = new Button("OK");
        Button buttonCancel = new Button("Cancel");
        
        OKHandlerClass eventHandler = new OKHandlerClass();
        CancelClass eventHandler2 = new CancelClass();
        buttonOK.setOnAction(eventHandler);
        buttonCancel.setOnAction(eventHandler2);
        
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
    class OKHandlerClass implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            System.out.println("You clicked OK");
        }
    }
    class CancelClass implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            System.exit(0);
        }
    }

}

