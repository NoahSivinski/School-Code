package cs1302.gallery;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.Priority;

/**
 * Represents an iTunes GalleryApp!.
 */
public class GalleryApp extends Application {

    FileMenu fileMenu;
    VBox vbox;
    ToolBar toolBar;
    Progress progressBar;

    /**
     * Default Constructor.
     */
    public GalleryApp() {
        super();
        fileMenu = new FileMenu();
        vbox = new VBox();
        toolBar = new ToolBar();
        progressBar = new Progress();
    } //GalleryApp


    /**
     * Start Method.
     * {@inheritdoc}
     */
    @Override
    public void start(Stage stage) {
        HBox.setHgrow(fileMenu, Priority.ALWAYS);
        vbox.getChildren().addAll(fileMenu, toolBar);
        HBox pane = new HBox();
        Scene scene = new Scene(vbox);
        stage.setMaxWidth(1280);
        stage.setMaxHeight(720);
        stage.setTitle("GalleryApp!");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    } // start

} // GalleryApp
