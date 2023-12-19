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
import javafx.application.Platform;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.geometry.Pos;

/**
 * ToolBar class.
 */
public class ToolBar extends VBox {

    VBox vbox;
    Button playPause;
    TextField input;
    HBox hbox;
    Button load;
    String sUrl;
    String[] urlTokens;
    URL url;
    GenList<String> urlList;
    Text text;
    Separator separator;
    ImageLoader imageGrid;
    boolean inputError;
    InputStreamReader reader;
    JsonElement je;
    JsonObject root;
    JsonArray results;
    int numResults;
    Timeline timeline;
    int count;
    Alert alert;
    public Progress progress;

    /**
     * Default constructor.
     */
    public ToolBar() {
        super();
        urlList = new LinkedGenList<String>();
        alert = new Alert(AlertType.ERROR, "Error: Your search is invalid.");
        progress = new Progress();
        try {
            url = new URL("https://itunes.apple.com/search?term=rock&limit=50&media=music");
            reader = new InputStreamReader(url.openStream());
            je = JsonParser.parseReader(reader);
            root = je.getAsJsonObject();
            results = root.getAsJsonArray("results");
            numResults = results.size();
            for (int i = 0; i < numResults; i++) {
                JsonObject result = results.get(i).getAsJsonObject();
                if (result.has("artworkUrl100")) {
                    JsonElement artworkUrl100 = result.get("artworkUrl100");
                    urlList.add(artworkUrl100.getAsString());
                    progress.incrementProgress(i / (numResults * 1.0));
                } //if
            } //for
            urlList = urlList.distinct();
            if (urlList.size() < 21) {
                throw new Exception();
            } //if
        } catch (Exception e) {
            alert.show();
            inputError = true;
        } //try-catch
        imageGrid = new ImageLoader(urlList);
        vbox = new VBox();
        hbox = new HBox(10);
        playPause = new Button("Play");
        input = new TextField("rock");
        load = new Button("Update Images");
        text = new Text("Search Query:");
        separator = new Separator(Orientation.VERTICAL);
        EventHandler<ActionEvent> playPauseClicked = event -> {
            if (playPause.getText().equals("Pause") && !inputError) {
                playPause.setText("Play");
                timeline.stop();
            } else if (playPause.getText().equals("Play") && !inputError) {
                playPause.setText("Pause");
                timeline.play();
            }
        };
        initializeTimeline();
        playPause.setOnAction(playPauseClicked);
        load.setOnAction( (e) -> {
            Platform.runLater(() -> loadImage(e));
        });
        timeline.pause();
        hbox.getChildren().addAll(playPause, separator, text, input, load);
        hbox.setAlignment(Pos.CENTER);
        this.getChildren().addAll(hbox, imageGrid, progress);
    } //ToolBar

    /**
     * Loads Images.
     * @param e source event
     */
    private void loadImage(ActionEvent e) {
        try {
            progress.pbar.setProgress(0.0);
            urlList = new LinkedGenList<String>();
            inputError = false;
            urlTokens = input.getText().split(" ");
            sUrl = "https://itunes.apple.com/search?term=";
            for (int i = 0; i < urlTokens.length - 1; i++) {
                sUrl += urlTokens[i] + "+";
            } //for
            sUrl += urlTokens[urlTokens.length - 1];
            sUrl += "&limit=50&media=music";
            url = new URL(sUrl);
            reader = new InputStreamReader(url.openStream());
            je = JsonParser.parseReader(reader);
            root = je.getAsJsonObject();
            results = root.getAsJsonArray("results");
            numResults = results.size();
            urlList = new LinkedGenList<String>();
            for (int i = 0; i < numResults; i++) {
                JsonObject result = results.get(i).getAsJsonObject();
                JsonElement artworkUrl100 = result.get("artworkUrl100");
                urlList.add(artworkUrl100.getAsString());
                progress.incrementProgress(i / (numResults * 1.0));
            } //for
            urlList = urlList.distinct();
            if (urlList.size() < 21) {
                throw new Exception();
            } //if
        } catch (Exception exception) {
            alert.show();
            inputError = true;
        } //try-catch
        urlList = urlList.distinct();
        Platform.runLater(() -> imageGrid.updateImages(urlList));
        timeline.stop();
        Platform.runLater(() -> initializeTimeline());
    } // loadImage

    /**
     * Creates Timeline.
     */
    public void initializeTimeline() {
        EventHandler<ActionEvent> handler = event -> {
            count = imageGrid.cyclePics(urlList);
            if (count == urlList.size()) {
                timeline.pause();
            } //if
        }; //handler
        timeline = new Timeline();
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(2), handler);
        timeline.setCycleCount(urlList.size() - 19);
        timeline.getKeyFrames().add(keyFrame);
        if (playPause.getText().equals("Pause")) {
            timeline.play();
        } //if
    } //initializeTimeline

    /**
     * Runnable method.
     * @param target Runnable object
     */
    public static void runNow(Runnable target) {
        Thread t = new Thread(target);
        t.setDaemon(true);
        t.start();
    } // runNow

} //ToolBar
