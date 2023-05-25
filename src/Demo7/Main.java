package Demo7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        String bth = "2001-08-07";
        LocalDate ld1 = LocalDate.parse(bth);
        System.out.println(ld1.getDayOfWeek());
    }
}
