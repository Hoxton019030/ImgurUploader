package com.example.imguploader;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.nio.Buffer;

@SpringBootApplication
public class ImgUploaderApplication extends Application {

    public static void main(String[] args) {
        SpringApplication.run(ImgUploaderApplication.class, args);
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();
        Button button = new Button("我是按鈕");
        borderPane.setBottom(button);
//        borderPane.getChildren().add(borderPane);
        Scene scene = new Scene(borderPane);

        stage.setScene(scene);
        stage.show();
    }
}
