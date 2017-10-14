import javafx.application.Application;

// Scene
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;

// Stage
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

// Events
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

// Elements
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Test extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Chess Viewer 1.0");

        Parent root = FXMLLoader.load(getClass().getResource("ChessViewer-1.0.fxml"));
        Scene scene = new Scene(root, 1000, 800);

//        TestController testies = new TestController();
//        testies.initialize();

        stage.setScene(scene);
        stage.show();
    }
}