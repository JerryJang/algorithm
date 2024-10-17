import java.util.Scanner;

public class Main {
    public static int[] arr = new int[10];


    public static int gcd(int n, int m) {

        if(n%m == 0) return m;
        return gcd(m, n%m);

    }

    public static int lcm(int n, int m) {

        return n*m / gcd(n,m);
    }

    public static int solution(int n) {
        
        // 유클리드 호제법을 재귀적으로 사용...

        // 여러숫자를 .. 최소공배수 -> 각숫자의 곱 / 최대공약수;
        //최대공약수는 a와 b를 계속 나눈 나머지값이 0이되면 그것이 최대공약수로 판단.. 

        if(n==1) return arr[0];

        return lcm(arr[n-1], solution(n-1));


    }


    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
    
        for(int i=0; i<n; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.print(solution(n));
    }
}