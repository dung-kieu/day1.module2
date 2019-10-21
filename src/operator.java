import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        float widht;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter widht :");
        widht = scanner.nextFloat();
        System.out.println("enter height : ");
        height = scanner.nextFloat();

        float area = widht*height;
        System.out.println("Area = " + area);
    }
}
