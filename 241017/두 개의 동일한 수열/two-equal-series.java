import java.util.Scanner;
import java.util.Arrays;

public class Main {



    public static boolean isSame(int[] arr, int[] arr2, int n) {

        for(int i=0; i<n; i++) {
          //  System.out.println(" * :"+i+" arr : "+arr[i]+" arr2 : "+arr2[i]);
            if(arr[i]!=arr2[i]) {
           //          System.out.println(" 진입");
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

      int[] arr = new int[n];
     int[] arr2 = new int[n];


        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);
        
        if(isSame(arr, arr2 , n)) { 
            System.out.print("Yes"); 
        } else {
            System.out.print("No"); 
        }
    }
}