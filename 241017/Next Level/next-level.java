import java.util.Scanner;

class User {
    String id;
    int level;

    public User() {
        this.id = "";
        this.level = 10;
    }

    public User(String id, int level) {
        this.id = id;
        this.level = level;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        User user = new User();
        System.out.println("user codetree lv "+user.level);


        String str = sc.next();
        int n = sc.nextInt();

        user.level = n;
        System.out.println("user hello lv " + user.level);
    
    
    
    }
}