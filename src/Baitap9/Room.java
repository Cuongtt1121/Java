package Baitap9;

import java.util.ArrayList;
public class Room {
    String name;
    String position;
    ArrayList<Person> listPerson;

    public Room(String name, String position) {
        this.name = name;
        this.position = position;
        this.listPerson = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ArrayList<Person> getList() {
        return listPerson;
    }

    public void setList(ArrayList<Person> list) {
        this.listPerson = list;
    }
    public void addPerson(Person person){
        listPerson.add(person);
    }
    public void removePerson(Person person){
        listPerson.remove(person);
    }
    public void printRoom() {
        System.out.println("Name" + name);
        System.out.println("Position" + position);
        System.out.println("List of persons in the room:");
        for (int i = 0; i < listPerson.size(); i++){

        }
    }
}
