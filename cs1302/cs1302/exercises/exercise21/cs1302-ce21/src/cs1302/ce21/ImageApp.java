package cs1302.ce21;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.Priority;
import javafx.scene.layout.TilePane;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;

/**
 * A basic JavaFX 8 program which takes a user specified URL and loads it
 * into an {@code ImageView}.
 *
 */
public class ImageApp extends Application {

    Stage stage;
    Scene scene;

    /**
     * The entry point for our image viewer application.
     *
     * @param stage A reference to the stage object (window) created by the system.
     */
    public void start(Stage stage) {
        this.stage = stage;

        ImageLoader img1 = new ImageLoader();
        ImageLoader img2 = new ImageLoader();
        ImageLoader img3 = new ImageLoader();
        ImageLoader img4 = new ImageLoader();
        Tab tab1 = new Tab("", img1);
        Tab tab2 = new Tab("", img2);
        Tab tab3 = new Tab("", img3);
        Tab tab4 = new Tab("", img4);

        TabPane tpane = new TabPane();
        tpane.getTabs().addAll(tab1, tab2, tab3, tab4);

// Sets the textfield to grow, as necessary, to fill the hbox
        scene = new Scene(tpane);

        // Set up the stage and set it to be visible
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("1302 Image Viewer!");
        stage.sizeToScene();
        stage.show();

    } // start


} // ImageApp
