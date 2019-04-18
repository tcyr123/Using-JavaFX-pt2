package fx1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //CREATE A CIRCLE
        Pane pane = new Pane();
        Circle c = new Circle();
        c.centerXProperty().bind(pane.widthProperty().divide(2));
        c.centerYProperty().bind(pane.heightProperty().divide(2));
        c.setRadius(50);;
        c.setStroke(Color.BLACK);
        c.setFill(Color.WHITE);
        pane.getChildren().add(c);
        
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
