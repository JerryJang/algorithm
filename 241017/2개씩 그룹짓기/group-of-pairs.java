import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Main {

    public static int solution(int[] arr, int n) {

        int[] isMAX = new int[n];

        for(int i =0; i<n; i++) { 
            isMAX[i] += arr[i];

        }
        int k = 0;
        for(int j =(2*n)-1; j>=n; j-- ) {
                isMAX[k] += arr[j];
                k++;
            }

    int max = 0; 
    for(int m = 0; m<n; m++) {
        if(isMAX[m]>max) {
            max = isMAX[m];
        }
    }


       return max;

    }



    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[2*n];

        for(int i =0; i<2*n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(solution(arr, n));
    
    }
}