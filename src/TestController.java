import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class TestController {

    @FXML
    private Pane a1;

    @FXML
    private Pane a3;



    @FXML
    void initialize() {
        assert a1 != null : "fx:id=\"a1\" was not injected: check your FXML file";

        a1.setStyle("-fx-background-color: #000;");
        System.out.println("houston we have a hit");
    }
}