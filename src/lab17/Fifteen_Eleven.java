package lab17;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Fifteen_Eleven extends Application{ 
        
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        
        Pane pane = new Pane();
        Circle circle = new Circle();
        circle.setRadius(5);
        pane.getChildren().add(circle);
        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        circle.setOnKeyPressed((KeyEvent e) -> {
            switch(e.getCode()){
                case DOWN: circle.setCenterY(circle.getCenterY() + 10); break;
                case UP: circle.setCenterY(circle.getCenterY() - 10); break;
                case LEFT: circle.setCenterX(circle.getCenterX() - 10); break;
                case RIGHT: circle.setCenterX(circle.getCenterX() + 10); break; 
            }
        });
        circle.requestFocus();
        
    }
    public static void main(String[] args) {
        launch(args);
    }

}

