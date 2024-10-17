import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int j = 0; j<n; j++) {
            arr[j] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        } 

        System.out.println();
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());

        for(int i=0; i<n; i++) {
            System.out.print(arr2[i]+" ");
        } 

        // Integer[] arr = new Integer[]{12,4,3,1,0,25,60,20};
        // Arrays.sort(arr, Collections.reverseOrder());

        // Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        // Arrays.sort(arr2, Collections.reverseOrder());

    }
}