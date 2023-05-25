package Product;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Homecontroller {
    public TextField txttenSP;
    public TextField txtgia;
    public TextField txtsoluong;
    public TextField txtmota;
    public TextField txtdanhmuc;

    public static ObservableList<Info> listProduct = FXCollections.observableArrayList();
    public ListView<Info> lv;
    public Info editProduct;
    public void Submit (javafx.event.ActionEvent actionEvent) {

            try {
                String tenSP = txttenSP.getText();
                String gia = txtgia.getText();
                String soluong = txtsoluong.getText();
                String mota = txtmota.getText();
                String danhmuc = txtdanhmuc.getText();
                try {
                    double number = Double.parseDouble(gia);
                }catch (NumberFormatException e){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Nhap so!!");
                }
                if (editProduct != null){
                    editProduct.setTenSP(tenSP);
                    editProduct.setGia(gia);
                    editProduct.setDanhmuc(danhmuc);
                    editProduct.setMota(mota);
                    editProduct.setSoluong(soluong);
                    lv.setItems(listProduct);
                    lv.refresh();
                    editProduct = null;
                    txttenSP.clear();
                    txtdanhmuc.clear();
                    txtgia.clear();
                    txtmota.clear();
                    txtsoluong.clear();
                    return;
                }
                Info pd = new Info(tenSP,gia,soluong,danhmuc,mota);
                listProduct.add(pd);
                lv.setItems(listProduct);
                txttenSP.clear();
                txtsoluong.clear();
                txtmota.clear();
                txtdanhmuc.clear();
                txtgia.clear();


            }catch (Exception e){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText(e.getMessage());
                alert.show();
            }
        }


    public void Edit (javafx.event.ActionEvent actionEvent) {
            editProduct = lv.getSelectionModel().getSelectedItem();
            if (editProduct != null){
                txttenSP.setText(editProduct.getTenSP());
                txtmota.setText(editProduct.getMota());
                txtdanhmuc.setText((editProduct.getDanhmuc()));
                txtgia.setText(editProduct.getGia());
                txtsoluong.setText(editProduct.getSoluong());
            }
        }



    public void Delete(javafx.event.ActionEvent actionEvent) {
        editProduct = lv.getSelectionModel().getSelectedItem();
        if (editProduct != null){
            lv.getItems().remove(editProduct);
        }
    }
}
