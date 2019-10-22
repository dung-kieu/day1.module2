public class numberPrime20 {
    public static void main(String[] args) {
        System.out.println("20 prime number :");
        int count = 0;
        int n = 2;
        while (count<20){
            if (Prime(n)){
                System.out.print( n +" ");
                count++;
            }
            n++;
        }
    }
    private static  boolean Prime( int a){
        if ( a < 2){
            return false;
        }
        for (int i =2;i<Math.sqrt(a);i++){
            if ( a % i ==0){
                return false;
            }
        }
        return true;
    }
}
