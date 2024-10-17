import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] arr = new String[n];

        for(int i=0; i<n; i++) {

            arr[i] = sc.next();
            
        } 

        Arrays.sort(arr);

        System.out.print(arr[m-1]);
 
    }
}