package fx1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Circle c = new Circle(20);
        c.setCenterX(150);
        c.setCenterY(80);
        pane.getChildren().add(c);
        Scene scene = new Scene(pane, 300, 200);
        c.setStroke(Color.BLUE);
        c.setFill(Color.RED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
