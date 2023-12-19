package cs1302.ce19;

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

/**
 * Represents a basic image viewer app.
 */
public class ImageApp extends Application {

    ImageView imageview;
    Image image;
    HBox hbox;
    TextField text;
    Button button;

    @Override
    public void start(Stage stage) {

        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);
        image = new Image("http://cobweb.cs.uga.edu/~mec/cs1302/gui/default.png");
        imageview = new ImageView(image);
        hbox = new HBox();
        button = new Button("Load");
        text = new TextField("https://");
        try {
            EventHandler<ActionEvent> loadHandler = (event) -> {
                try {
                    image = new Image(text.getText());
                    imageview.setImage(image);
                    System.out.println(text.getText());
                } catch (Exception e) {
                    System.out.println("Error: the url you have input is invalid");
                }
            };
            button.setOnAction(loadHandler);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: the url you have input is invalid");
        }
        hbox.getChildren().add(text);
        hbox.getChildren().add(button);

        vbox.getChildren().add(hbox);
        vbox.getChildren().add(imageview);



        stage.setScene(scene);
        stage.setTitle("cs1302 Image App!");
        stage.sizeToScene();
        stage.show();

    } // main

} // ImageApp
