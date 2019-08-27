package com.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GridTraining extends Application {
    public static void main (String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setGridLinesVisible(true);

        final Text actionTarget = new Text();
        actionTarget.setId("actiontarget");
        grid.add(actionTarget, 1, 6);

        Text sceneTitle = new Text("It is my first form in Java");
        sceneTitle.setId("welcome-text");
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label userName = new Label("User name:");
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label password = new Label("Password:");
        grid.add(password, 0, 2);
        TextField passwordTextField = new TextField();
        grid.add(passwordTextField, 1, 2);

        Button button = new Button();
        button.setText("Submit the form!");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actionTarget.setText("Here I am!");
                System.out.println("I'm pressed!");
            }
        });

        HBox hbbtn = new HBox(10);
        hbbtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbbtn.getChildren().add(button);

        grid.add(hbbtn, 1, 4);

        Scene scene = new Scene(grid, 600, 275);
        primaryStage.setTitle("This is my fist experiment with a grid!");
        primaryStage.setScene(scene);
        scene.getStylesheets().add
                (Login.class.getResource("login.css").toExternalForm());
        primaryStage.show();
    }
}
