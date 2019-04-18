package fx1;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BallControl extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BouncingBall bouncingBall = new BouncingBall();
        Scene scene = new Scene(bouncingBall, 800, 600);
        scene.setFill(Color.BEIGE);
        primaryStage.setTitle("Bouncing Ball Control");
        primaryStage.setScene(scene);
        primaryStage.show();
        bouncingBall.requestFocus();

        bouncingBall.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                bouncingBall.pause();
            }
        });

        bouncingBall.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                bouncingBall.play();
            }
        });

        bouncingBall.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.UP) {
                    bouncingBall.increaseSpeed();
                } else if (event.getCode() == KeyCode.DOWN) {
                    bouncingBall.decreaseSpeed();
                } else if (event.getCode() == KeyCode.LEFT) {
                    bouncingBall.moveLeft();
                } else if (event.getCode() == KeyCode.RIGHT) {
                    bouncingBall.moveRight();
                }

            }
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
