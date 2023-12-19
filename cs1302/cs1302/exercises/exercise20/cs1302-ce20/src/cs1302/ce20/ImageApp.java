package cs1302.ce20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Priority;

/**
 * Represents a basic image viewer app.
 */
public class ImageApp extends Application {

    ImageView imageview;
    ImageView imageview2;
    ImageView imageview3;
    ImageView imageview4;
    Image image;
    HBox hbox;
    TextField text;
    Button button;
    HBox hbox2;
    Button button2;
    Button button3;
    Button button4;
    double height;

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);
        image = new Image("http://cobweb.cs.uga.edu/~mec/cs1302/gui/default.png");
        imageview = new ImageView(image);
        hbox = new HBox(10);
        button = new Button("Load");
        text = new TextField("https://");
        imageview2 = new ImageView("file:resources/zoom-in-50.png");
        imageview3 = new ImageView("file:resources/zoom-out-50.png");
        imageview4 = new ImageView("file:resources/actual-size-50.png");
        button2 = new Button("", imageview2);
        button3 = new Button("", imageview3);
        button4 = new Button("", imageview4);
        hbox2 = new HBox(10);
        HBox.setHgrow(text, Priority.ALWAYS);
        EventHandler<ActionEvent> loadHandler = (event) -> {
            try {
                image = new Image(text.getText());
                imageview.setImage(image);
                System.out.println(text.getText());
                stage.sizeToScene();
                height = image.getHeight();
            } catch (Exception e) {
                System.out.println("Error: the url you have input is invalid");
            }
        };
        button.setOnAction(loadHandler);
        hbox.getChildren().addAll(text, button);
        HBox.setHgrow(button2, Priority.ALWAYS);
        HBox.setHgrow(button3, Priority.ALWAYS);
        HBox.setHgrow(button4, Priority.ALWAYS);
        button2.setMaxWidth(Double.MAX_VALUE);
        button3.setMaxWidth(Double.MAX_VALUE);
        button4.setMaxWidth(Double.MAX_VALUE);
        EventHandler<ActionEvent> loadHandler2 = (event) -> {
            if (height == 600.0) {
                button2.disarm();
                imageview2.setOpacity(50);
            } else {
                button2.arm();
                imageview2.setOpacity(100);
                zoom(25);
                stage.sizeToScene();
            }
            button3.arm();
        };
        EventHandler<ActionEvent> loadHandler3 = (event) -> {
            if (height == 25.0) {
                button3.disarm();
                imageview3.setOpacity(50);
            } else {
                button3.arm();
                imageview3.setOpacity(100);
                zoom(-25);
                stage.sizeToScene();
            }
            button2.arm();
        };
        EventHandler<ActionEvent> loadHandler4 = (event) -> {
            height = 300;
            imageview.setFitHeight(height);
            imageview.setPreserveRatio(true);
            stage.sizeToScene();
            button2.arm();
            button3.arm();
        };
        button2.setOnAction(loadHandler2);
        button3.setOnAction(loadHandler3);
        button4.setOnAction(loadHandler4);
        hbox2.getChildren().addAll(button2, button3, button4);
        vbox.getChildren().add(hbox);
        vbox.getChildren().add(imageview);
        vbox.getChildren().add(hbox2);
        stage.setScene(scene);
        stage.setTitle("cs1302 Image App!");
        stage.sizeToScene();
        stage.show();
    } // main

    /**
     * Zooms the image in or out.
     * @param num amount to zoom
     */
    private void zoom(double num) {
        height += num;
        System.out.println(height);
        imageview.setFitHeight(height);
        imageview.setPreserveRatio(true);
        button3.disarm();
        if (height <= 25) {
            button3.disarm();
        } else {
            button2.arm();
        }
        if (height >= 600) {
            button3.disarm();
        } else {
            button3.disarm();
        }
    } //zoom

} // ImageApp
