import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();
        boolean isLeapYeas = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4){
            boolean isDivisible100 = year % 100 == 0;
            if (isDivisible100){
                boolean isDivisible400 = year % 400 == 0;
                if (isDivisible400){
                    isLeapYeas = true;
                }
            }else {
                isLeapYeas = true;
            }
        }

        if (isLeapYeas){
            System.out.printf("%d is a leap year" , year);
        }else {
            System.out.printf("%d is not a leap year" , year);
        }
    }
}
