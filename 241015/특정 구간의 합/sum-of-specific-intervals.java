import java.util.Scanner;

public class Main {

    public static int[] arr = new int[101];

    public static void task(int k, int l) {
        int sum =0;

        for(int i = k; i<=l; i++) {
            sum += arr[i];
        }

        System.out.println(sum);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }

        while(m>0) {

            int k = sc.nextInt();
            int l = sc.nextInt();

            task(k,l);
            m--;

        }

    }
}