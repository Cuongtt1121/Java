package Demo6;

public class Main {
    public static void main(String[] args) {
        try {
            int x =10;
            int y=0;
            int z = x/y;
            System.out.println("z = " + z);
        }catch (ArithmeticException e){
            System.out.println("Math error...");
        }catch (Exception e){
            System.out.println("Error...");
        }
    }
}
