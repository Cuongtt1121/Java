package Baitap9;

public class Person {
    String name;
    int age;
    String telephone;
    String adress;

    public Person(String name, int age, String telephone, String adress) {
        this.name = name;
        this.age = age;
        this.telephone = telephone;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}

