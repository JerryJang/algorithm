import java.util.Scanner;

public class Main {
       

    public static int check(String str, String check) {

    int n = str.length();
    int m = check.length();


    for(int i =0; i<n; i++) {
        for(int j=0; j<m; j++){
            if(str.charAt(i) == check.charAt(j)) {
                // System.out.println("i:"+i+" j:"+j);
                    int temp = 0;
                    int temp2 = m;
                while(m>0) {
                   
                    // System.out.println("i:"+i+temp+" j:"+j+temp);
                    if(str.charAt(i+temp) != check.charAt(j+temp)){
                        break;
                    }
                    temp +=1;
                    
                    m--;
                    if(temp == temp2){
                        return i;
                    }
                }

            }
        }
    }

        return -1;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String check = sc.next();

        int show = check(str, check);

        System.out.print(show);



    }
}