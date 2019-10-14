package com.igor.main;

import com.igor.utils.UtilsStackPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class MainApplication extends Application {

    private static final Logger LOGGER = LogManager.getLogger(MainApplication.class.getName());

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws InterruptedException {

        LOGGER.info("Start primary stage");

        UtilsStackPane root = new UtilsStackPane();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

}
