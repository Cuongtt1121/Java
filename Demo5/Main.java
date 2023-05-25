package Demo5;

public class Main {
    public static void main(String[] args) {
        IMale im = new IMale() {
            @Override
            public void drink() {

            }
        };
        //up casting(tao doi tuong lop con ep xuong kieu lop cha)-down casting(tao doi tuong lop cha ep xuong kieu lop con)
        //lambda expresion
        IMale im2 = () -> {
            System.out.println("Drink Beer");
        };
    }
}
