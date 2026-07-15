import java.time.LocalDate;

public class Solution1 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate after10Days = today.plusDays(10);

        System.out.println("Today's Date: " + today);
        System.out.println("Date After 10 Days: " + after10Days);
    }
}