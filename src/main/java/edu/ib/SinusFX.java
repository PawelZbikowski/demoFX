package edu.ib;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class SinusFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //Tutaj tekst
    private TextField txtTime; //Czas
    private TextField txtn; //liczba probek
    private TextField txtf; //czestotliwosc

    @Override
    public void start(Stage primaryStage) {

        VBox layout = new VBox(); //Layout manager - menadżer układu, vertical box
        layout.setSpacing(10);
        layout.setPadding(new Insets(20,20,30,20)); //ustawienie marginesow


        //Parameters
        Label label = new Label("Parameters");
        label.setFont(Font.font("Times", FontWeight.BOLD, 16));

        Label labelT = new Label("tStop: ");
        txtTime = new TextField();
        txtTime.setText("10");
        txtTime.setPrefWidth(80);

        Label labelN = new Label(" n: ");
        txtn = new TextField();
        txtn.setText("100");
        txtn.setPrefWidth(80);

        Label labelF = new Label(" f: ");
        txtf = new TextField();
        txtf.setText("1");
        txtf.setPrefWidth(80);

        HBox hBox = new HBox(labelT, txtTime, labelN, txtn, labelF, txtf); //Horizontal Box
        hBox.setAlignment(Pos.CENTER);

        layout.getChildren().add(label); //
        layout.getChildren().add(hBox); //

        primaryStage.setTitle("Sinus demo");
        Scene scene = new Scene(layout, 500, 600); //Scena
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
