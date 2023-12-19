package cs1302.gui;

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

/**
 * ImageLoader Class.
 */
public class ImageLoader extends VBox {

    /**
     * Default Constructor.
     */
    public ImageLoader() {
        super();
        vbox = new VBox();

        vbox = new VBox();
        urlLayer = new HBox(10);
        urlField = new TextField("https://");
        loadImage = new Button("Load");

        urlLayer.getChildren().addAll(urlField, loadImage);

        HBox.setHgrow(urlField, Priority.ALWAYS);

        // Load the default image with the default dimensions
        Image img = new Image(DEFAULT_IMG, DEF_HEIGHT, DEF_WIDTH, false, false);

        // Add the image to its container and preserve the aspect ratio if resized
        imgView = new ImageView(img);
        imgView.setPreserveRatio(true);

        // EventHandler for our button using a fancy method reference.
        //EventHandler<ActionEvent> loadImgHandler = this::loadImage;
        loadImage.setOnAction(this::loadImage);

        this.getChildren().addAll(urlLayer, imgView);
    } //ImageLoader


/** The root container for the application scene graph */
    VBox vbox;

    /** The container for the url textfield and the load image button */
    HBox urlLayer;
    TextField urlField;
    Button loadImage;

    /** The container for the loaded image */
    ImageView imgView;

    /** A default image which loads when the application starts */
    protected static final String DEFAULT_IMG =
        "http://cobweb.cs.uga.edu/~mec/cs1302/gui/default.png";

    /** Default height and width for Images */
    protected static final int DEF_HEIGHT = 500;
    protected static final int DEF_WIDTH = 500;

    /**
     * Students will provide javadoc comments here.
     *
     * @param e source event
     */
    private void loadImage(ActionEvent e) {

        try {
            Image newImg = new Image(urlField.getText(), DEF_HEIGHT, DEF_WIDTH, false, false);
            imgView.setImage(newImg);
        } catch(IllegalArgumentException iae) {
            System.out.println("The supplied URL is invalid");
        } // try

    } // loadImage

} //ImageLoader
