import java.util.Scanner;
import java.util.Arrays;

class Staff{
    char name; 
    int score;

    public Staff() {
        this.name = 'z';
        this.score = 0;
    }

    public Staff(char name, int score){
        this.name = name;
        this.score = score;
    }

}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Staff[] staff = new Staff[5];

        for(int i = 0; i<5; i++) {

            char name  = sc.next().charAt(0);
            int score = sc.nextInt();

            staff[i] = new Staff(name, score);
        }
        int latestVal =1000;
        int loc = 0;
        for(int j=0; j<5; j++) {
            if(latestVal>staff[j].score) {
               latestVal = staff[j].score;
                loc = j;
            }
        }
        System.out.print(staff[loc].name+" ");
        System.out.print(staff[loc].score);

    }
}