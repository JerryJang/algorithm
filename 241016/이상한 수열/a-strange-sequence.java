import java.util.Scanner;


public class Main {

    public static int solution(int n) {



       if (n == 1 ) return 1;
        if (n == 2) return 2;

        return solution(n/3)+solution(n-1);
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(solution(n));

    }
}