import java.util.Scanner;


public class Main {

    public static int solution(int n) {

        if(n ==1 || n==2) return n;

        if(n%2 ==0 ){
            return solution(n-2) + n;
        }else {
            return solution(n-2) + n;

        }

    }

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);

            int n= sc.nextInt();
            System.out.print(solution(n));
    }
}