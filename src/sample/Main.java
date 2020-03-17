package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
    Button button;
    int count = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("GUI, oh yeah.");
        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            boolean confirm = ConfirmBox.display("Close?", "Are you sure?");
            if (confirm) {
                primaryStage.close();
            }
        });

        button = new Button();
        button.setText("Click me ;)");

        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Why", "Are you sure?");
            if (result) {
                AlertBox.display("Hello", "Whats up");
            }
        });

        GridPane grid = new GridPane();
        grid.setHgap(8);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        Background background = new Background(new BackgroundFill(Color.BEIGE, new CornerRadii(20), new Insets(0)));
        grid.setBackground(background);

        grid.add(button, 5, 5);

        Scene scene = new Scene(grid, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

}
