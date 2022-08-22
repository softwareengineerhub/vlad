package com.example.myfxapp01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        //  1 2 3 4 5
        HBox hbox = new HBox();

        Label nameLabel = new Label("Name:");
        Label ageLabel = new Label("Age:");

        TextField nameTextField = new TextField();
        TextField ageTextField = new TextField();

        Button createButton = new Button("Create");
        TextArea personTextArea = new TextArea();
        personTextArea.setEditable(false);


        CreateButtonEventHandler createButtonEventHandler = new CreateButtonEventHandler();
        createButtonEventHandler.nameTextField = nameTextField;
        createButtonEventHandler.ageTextField = ageTextField;
        createButtonEventHandler.personTextArea = personTextArea;




        createButton.setOnAction(createButtonEventHandler);


        hbox.getChildren().add(nameLabel);
        hbox.getChildren().add(nameTextField);

        hbox.getChildren().add(ageLabel);
        hbox.getChildren().add(ageTextField);

        hbox.getChildren().add(createButton);
        hbox.getChildren().add(personTextArea);


        Scene scene = new Scene(hbox, 520, 480);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}