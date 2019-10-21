import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interset_rate = 1.0;

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter investment amount:");
        money = sc.nextDouble();
        System.out.println("Enter number of months :");
        month = sc.nextInt();
        System.out.println("enter annaul interest rate in percentage :");
        interset_rate = sc.nextDouble();
        double total_interset = 0;
        for (int i =0;i<month;i++){
            total_interset = money*(interset_rate/100/1)*3;
        }
        System.out.println("Total of interset :" + total_interset);
    }
}
