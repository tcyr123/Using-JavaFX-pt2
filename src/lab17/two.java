package lab17;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class two extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("PACMAN");
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.setStyle("-fx-background-color: black;");
        //BODY
        Arc arc1 = new Arc();
        arc1.setFill(Color.YELLOW);
        arc1.setStroke(Color.BLACK);
        arc1.setCenterX(100.0f);
        arc1.setCenterY(100.0f);
        arc1.setRadiusX(50.0f);
        arc1.setRadiusY(50.0f);
        arc1.setStartAngle(45.0f);
        arc1.setLength(270.0f);       
        arc1.setType(ArcType.ROUND);    
        pane.getChildren().add(arc1);
        //BLACK EYE
        Circle circle1 = new Circle();
        circle1.setFill(Color.BLACK);
        circle1.setRadius(5.0f);
        circle1.setCenterX(100.0f);
        circle1.setCenterY(70.0f);
        pane.getChildren().add(circle1);
        //WHITE EYE
        Circle circle2 = new Circle();
        circle2.setFill(Color.WHITE);
        circle2.setRadius(2.5f);
        circle2.setCenterX(102.0f);
        circle2.setCenterY(69.0f);
        pane.getChildren().add(circle2);
        //FOOD
        Circle food = new Circle();
        food.setFill(Color.WHITE);
        food.setRadius(5.0f);
        food.setCenterX(150.0f);
        food.setCenterY(100.0f);
        pane.getChildren().add(food);
        
        Circle food2 = new Circle();
        food2.setFill(Color.WHITE);
        food2.setRadius(5.0f);
        food2.setCenterX(200.0f);
        food2.setCenterY(100.0f);
        pane.getChildren().add(food2);
        
        Circle food3 = new Circle();
        food3.setFill(Color.WHITE);
        food3.setRadius(5.0f);
        food3.setCenterX(250.0f);
        food3.setCenterY(100.0f);
        pane.getChildren().add(food3);
        
 
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

