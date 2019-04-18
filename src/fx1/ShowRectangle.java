package fx1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShowRectangle extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Rectangle r = new Rectangle(30, 30, 88, 44);
        //r.setCenterX(150);
        //r.setCenterY(80);
        pane.getChildren().add(r);
        Scene scene = new Scene(pane, 300, 200);
        r.setStroke(Color.BLACK);
        r.setFill(Color.RED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}


