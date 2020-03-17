package ba.unsa.etf.rs.tutorijal2;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class Controller {


    public Label labalaPrezime;
    public BorderPane pane;

    public void onClick(ActionEvent actionEvent) {
        labalaPrezime.setText(labalaPrezime.getText() + labalaPrezime.getText());
    }
}
