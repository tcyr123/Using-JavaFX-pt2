package fx1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Checkerboard extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //CREATE A CIRCLE
        Pane pane = new Pane();
        Rectangle r = new Rectangle();
        r.widthProperty().bind(pane.widthProperty().divide(10));
        r.heightProperty().bind(pane.heightProperty().divide(10));
        r.setX(0);
        r.setY(0);
        r.setStroke(Color.BLACK);
        r.setFill(Color.YELLOW);
        pane.getChildren().add(r);
        int t = 0;
        for(int j = 1; j <= 8; j++)
        {
            int k = 0;
            for (int i = 1; i <= 8; i++) {   
                Rectangle r2 = new Rectangle();
                r2.widthProperty().bind(pane.widthProperty().divide(10));
                r2.heightProperty().bind(pane.heightProperty().divide(10));
                r2.setX(k);
                r2.setY(t);
                r2.setStroke(Color.BLACK);
                if(j % 2 == 0){
                    if(i%2==0){
                    r2.setFill(Color.BLUE);}
                    else
                    {r2.setFill(Color.YELLOW);}
                }
                else
                {
                    if(i%2==0){
                    r2.setFill(Color.YELLOW);}
                    else
                    {r2.setFill(Color.BLUE);}
                }
                pane.getChildren().add(r2);
                k = k+80;
            }
            t = t+80;
        }
        
        

        //CREATE A SCENE
        Scene scene = new Scene(pane, 800, 800);
        primaryStage.setTitle("ShowCircleCentered");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
