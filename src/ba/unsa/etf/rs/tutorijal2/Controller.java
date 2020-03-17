package ba.unsa.etf.rs.tutorijal2;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {


    public Label labalaPrezime;

    public void onClick(ActionEvent actionEvent) {
        labalaPrezime.setText(labalaPrezime.getText() + labalaPrezime.getText());
    }
}
