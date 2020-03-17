package sample;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class CardBox {

    public static void display(String title, String cardName) {
        Stage window = new Stage();

        //Block events to other windows
        window.setTitle(title);
        window.setX(50);
        window.setY(100);

        Label label = new Label();
        label.setText(cardName);
        Button closeButton = new Button("Play Card");
        closeButton.setOnAction(e -> window.close());

        BorderPane layout = new BorderPane();
        layout.setBottom(closeButton);
        layout.setCenter(label);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

}
