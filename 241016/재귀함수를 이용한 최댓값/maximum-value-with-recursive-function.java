import java.util.Scanner;

public class Main {

    public static int[] arr = new int[100];

    public static int max = 0;
    public static int solution(int n) {

        if(n==0) return 0;

        solution(n-1);
        //System.out.println("n: "+n);

        if(arr[n]>max) {
            // System.out.println("o :"+arr[n]);
            max = arr[n];
        }

        return max;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }

    System.out.print(solution(n));

    }
}