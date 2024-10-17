import java.util.Scanner;

class Bob{
    String code;
    char color;
    int second;

    public Bob(String code, char color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}

    public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char chr = sc.next().charAt(0);
        int second = sc.nextInt();

        Bob bob = new Bob(str, chr, second);


        System.out.println("code : "+bob.code);
        System.out.println("color : "+bob.color);
        System.out.println("second : "+bob.second);
    }


}