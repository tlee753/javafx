import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

public class HeaderColorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private HBox header;

    @FXML
    private ToggleGroup headerColorToggleGroup;

    @FXML
    void initialize() {
        assert header != null : "fx:id=\"header\" was not injected: check your FXML file 'header-color.fxml'.";
        assert headerColorToggleGroup != null : "fx:id=\"headerColorToggleGroup\" was not injected: check your FXML file 'header-color.fxml'.";

        headerColorToggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observableValue, Toggle oldToggle, Toggle newToggle) {
                RadioButton radio = (RadioButton) newToggle;
                header.setStyle("header-base-color: " + radio.getText());
            }
        });
    }
}