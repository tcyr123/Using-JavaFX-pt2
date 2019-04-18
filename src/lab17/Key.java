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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Key extends Application{ 
        
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        
        Pane pane = new Pane();
        Text text = new Text(20, 20, "X");
        pane.getChildren().add(text);
        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        text.setOnKeyPressed((KeyEvent e) -> {
            switch(e.getCode()){
                case DOWN: text.setY(text.getY() + 10); break;
                case UP: text.setY(text.getY() - 10); break;
                case LEFT: text.setX(text.getX() - 10); break;
                case RIGHT: text.setX(text.getX() + 10); break;
                default:
                    if(e.getText().length()>0)
                        text.setText(e.getText());
            }
        });
        text.requestFocus();
        
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

