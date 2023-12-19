package cs1302.gallery;

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
import javafx.scene.control.MenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

/**
 * FileMenu class.
 */
public class FileMenu extends HBox {

    HBox hbox;
    Button button;
    final Menu menu;
    MenuBar menuBar;
    MenuItem menuItem;

    /**
     * Default Constructor.
     */
    public FileMenu() {

        super();
        hbox = new HBox();
        button = new Button();
        menu = new Menu("File");
        menuBar = new MenuBar();
        menuItem = new MenuItem("Exit");
        EventHandler<ActionEvent> clicked = event -> {
            System.exit(0);
        };
        menuItem.setOnAction(clicked);
        menu.getItems().add(menuItem);
        menuBar.getMenus().add(menu);
        HBox.setHgrow(menuBar, Priority.ALWAYS);
        this.getChildren().addAll(menuBar);
    } //Menu

} //Menu
