package BT10;

import java.util.ArrayList;

public class PhoneNumber {
    public String name;
    public int phone;

    public PhoneNumber(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
abstract class phone {
    abstract void insertPhone(String name,String phone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name, String newPhone);
    abstract void searchPhone(String name);
    abstract void sort();

}
