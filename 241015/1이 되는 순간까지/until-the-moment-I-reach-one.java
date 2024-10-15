import java.util.Scanner;

public class Main {

    public static int cnt =0;
    public static int recursive(int n) {
        
        if(n==1) return 0;

        if(n%2==0) {
            return recursive(n/2) +1;
        }else {
            return recursive(n/3) +1; 
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(recursive(n));
    }
}