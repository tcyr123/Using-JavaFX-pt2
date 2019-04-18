package fx1;

import javafx.animation.KeyFrame;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class BouncingBall extends Pane {

    public final double radius = 10;
    public double x = 50, y = 50;
    public double x2 = x + 400, y2 = y + 350;
    private double dx = 1, dy = 1;
    private double dx2 = 1, dy2 = 1;
    private Circle circle = new Circle(x, y, radius);
    private Circle circle2 = new Circle(x2, y2, radius);
    private Rectangle rectangle = new Rectangle(70, 20);
    private Timeline animation;
    Text humanText = new Text(10, 25, "Human Score: 0");
    Text compText = new Text(10, 45, "Computer Score: 0");
    int humanScore = 0;
    int compScore = 0;

    public BouncingBall() {
        circle.setFill(Color.GREEN);
        circle2.setFill(Color.ORANGE);
        rectangle.setFill(Color.BLUEVIOLET);
        rectangle.setX(365); //365
        rectangle.setY(580); //580

        getChildren().add(circle);
        getChildren().add(circle2);
        getChildren().add(rectangle);
        getChildren().add(humanText);
        getChildren().add(compText);

        animation = new Timeline(
                new KeyFrame(Duration.millis(50), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        moveBall();
                    }
                })
        );
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }

    public final void SetOnMousePressed(EventHandler<? super MouseEvent> value) {

    }

    private void moveBall() {
        //check boundaries  set parameters for rectangle
        if (x >= rectangle.getX() && x <= rectangle.getX() + 70 && y == rectangle.getY() - 10 && dy != -1) {
            dy *= -1;
            dx *= -1;
            humanScore++;
            humanText.setText("Human Score: " + humanScore);
        }
        if (x == radius || x == getWidth() - radius) {
            dx *= -1; //Change ball move direction
        }
        if (y >= getHeight()-10) {
            compScore++;
            compText.setText("Computer Score: " + compScore);
        }
        if (y == radius || y == getHeight() - radius) {
            dy *= -1; //Change ball move direction

        }
        //SECOND BALL RULES
        if (x2 >= rectangle.getX() && x2 <= rectangle.getX() + 70 && y2 == rectangle.getY() - 10 && dy2 != -1) {
            dy2 *= -1;
            dx2 *= -1;
            humanScore++;
            humanText.setText("Human Score: " + humanScore);
        }
        if (x2 == radius || x2 == getWidth() - radius) {
            dx2 *= -1; //Change ball move direction
        }
        if (y2 >= getHeight()-10) {
            compScore++;
            compText.setText("Computer Score: " + compScore);
        }
        if (y2 == radius || y2 == getHeight() - radius) {
            dy2 *= -1; //Change ball move direction
        }

        //adjust ball position by 1 or -1
        x += dx;
        y += dy;
        x2 += dx2;
        y2 += dy2;
        circle.setCenterX(x);
        circle.setCenterY(y);
        circle2.setCenterX(x2);
        circle2.setCenterY(y2);
    }

    public void play() {
        animation.play();
    }

    public void pause() {
        animation.pause();
    }

    public void increaseSpeed() {
        animation.setRate(animation.getRate() * 1.5);
    }

    public void decreaseSpeed() {
        animation.setRate(animation.getRate() * 1.5 > 0 ? animation.getRate() / 1.5 : 0);
    }

    public void moveLeft() {
        if (rectangle.getX() > 0) {
            rectangle.setX(rectangle.getX() - 30);
        }
        rectangle.setY(getHeight() - 20);
    }

    public void moveRight() {
        if (rectangle.getX() < getWidth() - 70) {
            rectangle.setX(rectangle.getX() + 30);
        }
        rectangle.setY(getHeight() - 20);
    }

    public DoubleProperty rateProperty() {
        return animation.rateProperty();
    }

}
