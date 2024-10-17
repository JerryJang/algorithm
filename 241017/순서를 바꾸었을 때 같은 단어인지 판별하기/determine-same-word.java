import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static char[] arr = new char[100000];
    public static char[] arr2 = new char[100000];

    public static boolean isSame(String str, String str2){

    char[] changeStr = str.toCharArray();
    char[] changeStr2 = str2.toCharArray();


    if(changeStr.length != changeStr2.length ) {
        return false;
    }

    Arrays.sort(changeStr);
    Arrays.sort(changeStr2);

    for(int i=0; i<changeStr.length; i++) {
        if(changeStr[i] != changeStr2[i]) {
            return false;
        }
    }

    return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        
        
        String str = sc.next();
        String str2 = sc.next();

        if(isSame(str, str2)) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
        

    }
}