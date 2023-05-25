package javafx03;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.awt.*;
import java.io.IOException;

public class EditController {
    TextField editName;
    TextField editPhone;

    public void Submit(ActionEvent actionEvent) {
        try {
            String name = editName.getText();
            String phone = editPhone.getText();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void Back(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentList.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }


}
