package cs1302.ce21;

import javafx.application.Application;

/**
 * Driver Class.
 */
public class ImageDriver {

    public static void main(String[] args) {
        try {
            Application.launch(ImageApp.class, args);
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Likely due to X11 timeout. Logout and log back in...");
            System.exit(1);
        } // try
    } // main

} // ImageDriver
