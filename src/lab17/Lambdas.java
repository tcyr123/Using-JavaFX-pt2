package lab17;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Lambdas extends Application{ 
        
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text(40, 40, "Programming is fun");
        
        Pane pane = new Pane(text);
        
        
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        HBox Hbox = new HBox(btUp, btDown, btLeft, btRight);
        Hbox.setSpacing(10);
        Hbox.setAlignment(Pos.CENTER);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(Hbox);
        
        Scene scene = new Scene(borderPane, 400, 350);
        primaryStage.setTitle("AnnonymousHandlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        btUp.setOnAction((ActionEvent event) ->
        {text.setY(text.getY() > 10 ? text.getY() - 5 : 10);});
        
        btDown.setOnAction((ActionEvent event) ->
        {text.setY(text.getY() < pane.getHeight()+20 ? text.getY() + 5 :pane.getHeight()+20);});
        
        btLeft.setOnAction((ActionEvent event) -> 
        {text.setX(text.getX() > 10  ? text.getX() - 5 : 0);});
        
        btRight.setOnAction((ActionEvent event) ->
        {text.setX(text.getX() < pane.getWidth()-120  ? text.getX() + 5 : pane.getWidth()-120);});
        
       /* btUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                text.setY(text.getY() > 10 ? text.getY() - 5 : 10);
            }
        });
        btDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                text.setY(text.getY() < pane.getHeight() ? text.getY() + 5 :pane.getHeight());
            }
        });
        btLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                text.setX(text.getX() > 10  ? text.getX() - 5 : 0);
            }
        });
        btRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                text.setX(text.getX() < pane.getWidth()-120  ? text.getX() + 5 : pane.getWidth()-120);
            }
        });
*/
        
    }
    public static void main(String[] args) {
        launch(args);
    }

}

