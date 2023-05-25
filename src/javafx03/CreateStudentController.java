package javafx03;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

import java.awt.*;
import java.io.IOException;

public class CreateStudentController {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtPhone;

    public void BacktoList(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentList.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));

    }

    public void Submit(ActionEvent actionEvent) {
        try {
            String name = txtName.getText();
            String email = txtEmail.getText();
            String phone = txtPhone.getText();
            for (javafx03.Student s : StudentController.listStudent){
                if (s.getName().equals(name))
                    throw new Exception("Ten sinh vien nay da ton tai!!");
                if (s.getEmail().equals(email))
                    throw new Exception("Email nay da ton tai!!");
            }
            javafx03.Student sv = new Student(name,email,phone);
            StudentController.listStudent.add(sv);
            BacktoList(null);

        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }
}
