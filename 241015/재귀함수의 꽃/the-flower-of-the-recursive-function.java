import java.util.Scanner;

public class Main {

    public static void recurcive(int n) {

        if(n==0) return;

        System.out.print(n+" ");
        recurcive(n-1);
        System.out.print(n+" ");


    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        recurcive(n);


    }
}