package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("GUI motherfucker, oh yeah.");

        button = new Button();
        button.setText("Click me senpai ;)");
        button.setOnAction(e -> {
            System.out.println("Thanks daddy");
            System.out.println("Initiating self destruct");
        });
        StackPane layout = new StackPane();
        layout.getChildren().add(button);



        Scene scene = new Scene(layout, 300, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
