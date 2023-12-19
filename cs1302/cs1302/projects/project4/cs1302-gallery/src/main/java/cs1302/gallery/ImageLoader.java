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
import cs1302.genlistadt.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.animation.Timeline;

/**
 * ImageLoader Class.
 */
public class ImageLoader extends VBox {

    VBox vbox;
    HBox urlLayer;
    TextField urlField;
    Button loadImage;
    ImageView imgView;
    Image img;
    TilePane imageField;
    ImageView[] imageViews;
    int[][] grid;
    int randomNum;
    int count;

    /**
     * Default Constructor.
     * @param urlList list of URLs
     */
    public ImageLoader(GenList<String> urlList) {
        super();
        vbox = new VBox();
        grid = new int[4][5];
        count = 20;
        imageViews = new ImageView[20];
        imageField = new TilePane();
        imageField.setPrefColumns(5);
        imageField.setPrefRows(4);
        for (int i = 0; i < 20 && i < urlList.size(); i++) {
            imageViews[i] = new ImageView(new Image(urlList.get(i), 100, 100, true, false));
        } //for
        for (int i = 0; i < 20 && i < urlList.size(); i++) {
            imageField.getChildren().add(imageViews[i]);
        } //for
        vbox.getChildren().add(imageField);
        this.getChildren().addAll(vbox);
    } //ImageLoader

    /**
     * Cycles through pictures.
     * @param urlList list of URLs
     * @return index of picture
     */
    public int cyclePics(GenList<String> urlList) {
        randomNum = ((int)(Math.random() * 20));
        imageViews[randomNum].setImage(new Image(urlList.get(count), 100, 100, true, false));
        count++;
        return count;
    } //cyclePics

    /**
     * Updates images in GUI.
     * @param urlList list of URLs
     */
    public void updateImages(GenList<String> urlList) {
        count = 20;
        for (int i = 0; i < 20 && i < urlList.size(); i++) {
            imageViews[i].setImage(new Image(urlList.get(i), 100, 100, true, false));
        } //for
    } //updateImages

} //ImageLoader
