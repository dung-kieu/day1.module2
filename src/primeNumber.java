import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scanner.nextInt();
        System.out.print("smaller primes are:");
        if (n>=2){
            System.out.print(2);
        }
        for (int i=3;i<n;i++){
            if (Prime(i)){
                System.out.print(" " +i);
            }
        }
    }

    private static boolean Prime(int a){
        if (a<2){
            return false;
        }
        for (int i =2;i<Math.sqrt(a);i++){
            if (a % i ==0){
                return false;
            }
        }
        return true;
    }
}
