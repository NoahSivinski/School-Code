package cs1302.gallery;

import javafx.application.Platform;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextField;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.net.URL;
import java.io.InputStreamReader;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import cs1302.genlistadt.*;
import cs1302.genlist.*;
import javafx.geometry.Orientation;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import javafx.animation.KeyValue;
import javafx.scene.control.ProgressBar;

/**
 * ProgressBar Class.
 */
public class Progress extends HBox {

    public ProgressBar pbar;
    HBox hbox;
    Text text;

    /**
     * Default Constructor.
     */
    public Progress() {
        super();
        pbar = new ProgressBar(0.0);
        text = new Text("Images provided courtesy of iTunes");
        hbox = new HBox(10);
        hbox.getChildren().addAll(pbar, text);
        this.getChildren().addAll(hbox);
    } //ProgressBar

    /**
     * Increments the progress bar.
     * @param progress progress percentage complete
     */
    public void incrementProgress(double progress) {
        //System.out.println(progress);
        Platform.runLater(() -> pbar.setProgress(progress));
    } //incrementProgress

} //ProgressBar
