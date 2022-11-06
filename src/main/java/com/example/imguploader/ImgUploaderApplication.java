package com.example.imguploader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
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
//        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/s.fxml"));
//        System.out.println("root = " + root);
        BorderPane borderPane = new BorderPane();
        Pane root    = FXMLLoader.load(getClass().getResource("/fxml/teet.fxml"));
//        Button button = new Button("我是按鈕");
//        borderPane.setBottom(button);
//        borderPane.getChildren().add(borderPane);
        Scene scene = new Scene(root,400,200);
        stage.setScene(scene);
        stage.show();
    }
}
