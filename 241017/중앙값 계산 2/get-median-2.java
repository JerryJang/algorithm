import java.util.Scanner;
import java.util.Arrays;

public class Main {


    public static void midVal(int[] arr, int j) {

        int[] midArr = new int[j];

        for(int k=0; k<j; k++) {
            midArr[k] = arr[k];
        }

        Arrays.sort(midArr);

        System.out.print(midArr[j/2]+" ");

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt(); 

        /* 실제 홀수일때 */
            if(i%2==0) {
                midVal(arr,i+1);             
            }   

        } 
    }
}