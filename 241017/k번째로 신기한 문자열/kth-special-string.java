import java.util.Scanner;
import java.util.Arrays;

public class Main {


    public static void filter(String[] arr, int n, String T, int u){

        int lenthOfT = T.length();
        int temp = 0;
        int cnt = 0;

        

        for(int i=0; i<n; i++){
            // System.out.println("arr :"+arr[i].substring(0,lenthOfT).getClass().getName());
            // System.out.println("T :"+T.getClass().getName());
            if(arr[i].substring(0,lenthOfT).equals(T) && arr[i].length() > lenthOfT) {
                cnt++;       
            }
        }
        // System.out.println(cnt);

        String[] filteredArr = new String[cnt];

        for(int k=0; k<n; k++) {
            if(arr[k].substring(0,lenthOfT).equals(T)&& arr[k].length() > lenthOfT){ 
                filteredArr[temp] = arr[k]; 
                temp++;     
                }
        }

        Arrays.sort(filteredArr);

        // for(int j=0; j<filteredArr.length; j++) {
        //     System.out.println(filteredArr[j]);
        // }

        System.out.print(filteredArr[u-1]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String T = sc.next();

        String[] arr = new String[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.next();
        }

        filter(arr, n, T,k);
        

    }
}