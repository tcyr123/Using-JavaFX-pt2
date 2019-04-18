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
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Fifteen_Nine extends Application{ 
    private double x = 100;
           private double y = 110;   
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        
        Pane pane = new Pane();
        Line line = new Line();
        line.setStartX(100);
        line.setStartY(100);
        line.setEndX(100);
        line.setEndY(110);
        pane.getChildren().add(line);
        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
      
        line.setOnKeyPressed((KeyEvent e) -> {
            
           
           
            
            switch(e.getCode()){
                case DOWN: pane.getChildren().add(new Line(x, y, x, y +10));
                y+=10; break;
                case UP: pane.getChildren().add(new Line(x, y, x, y -10));
                y-=10; break;
                case LEFT: pane.getChildren().add(new Line(x, y, x-10, y));
                x-=10; break;
                case RIGHT:
                    pane.getChildren().add(new Line(x, y, x+10, y));
                    x += 10;
                    break;
            }
            
        });
        line.requestFocus();
        
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

