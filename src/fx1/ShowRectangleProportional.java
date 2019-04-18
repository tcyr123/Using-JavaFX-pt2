package fx1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShowRectangleProportional extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //CREATE A CIRCLE
        Pane pane = new Pane();
        Rectangle r = new Rectangle();
        r.widthProperty().bind(pane.widthProperty().divide(2));
        r.heightProperty().bind(pane.heightProperty().divide(2));
        r.setX(50);
        r.setY(50);
        r.setStroke(Color.BLACK);
        r.setFill(Color.WHITE);
        pane.getChildren().add(r);
        
        //CREATE A SCENE
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowCircleCentered");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
