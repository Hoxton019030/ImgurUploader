package com.example.imguploader;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImgUploaderApplication extends Application {

    public static void main(String[] args) {
        SpringApplication.run(ImgUploaderApplication.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
