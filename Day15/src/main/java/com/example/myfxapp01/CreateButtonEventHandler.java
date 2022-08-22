package com.example.myfxapp01;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CreateButtonEventHandler implements EventHandler {
    public TextField nameTextField;
    public TextField ageTextField = null;
    public TextArea personTextArea;

    @Override
    public void handle(Event event) {
        System.out.println("CreateButtonEventHandler.handle()");
        String name = nameTextField.getText();
        System.out.println("name="+name);
        String ageText = ageTextField.getText();
        int age = Integer.parseInt(ageText);
        System.out.println("age="+age);
        Person person = new Person(name, age);
        person.printPerson();
        String personAsText = person.toString();
        personTextArea.appendText(personAsText+"\n");
        nameTextField.setText("");
        ageTextField.setText("");
    }
}
