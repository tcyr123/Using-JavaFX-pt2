package lab17;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class one extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //CREATE A CIRCLE
        Pane pane = new Pane();
        Scene scene = new Scene(new two());
        primaryStage.setTitle("ShowLine");
        primaryStage.setScene(scene);
        primaryStage.show();
        
       /* Line line = new Line();
        line.setStartX(0.0f);
        line.setEndX(100.0f);
        line.setStartY(0.0f);
        line.setEndY(100.0f);
        
        pane.getChildren().add(line);*/
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    class two extends Pane{
    public two(){
        
    Line line1 = new Line(0,0,10,10);
    line1.endXProperty().bind(widthProperty().subtract(10));
    line1.endYProperty().bind(heightProperty().subtract(10));
    line1.setStrokeWidth(5);
    line1.setStroke(Color.GREEN);
    this.getChildren().add(line1);
    
    Line line2 = new Line(0,0,10,10);
    line2.startXProperty().bind(widthProperty().subtract(10));
    line2.endYProperty().bind(heightProperty().subtract(10));
    line2.setStrokeWidth(5);
    line2.setStroke(Color.GREEN);
    this.getChildren().add(line2);
    
    Line line3 = new Line(0,0,10,10);
    line3.startXProperty().bind(widthProperty().divide(2));
    line3.endXProperty().bind(widthProperty().divide(2));
    line3.endYProperty().bind(heightProperty().subtract(10));
    line3.setStrokeWidth(5);
    line3.setStroke(Color.RED);
    this.getChildren().add(line3);
    }
    }
}

