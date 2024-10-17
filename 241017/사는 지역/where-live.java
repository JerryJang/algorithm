import java.util.Scanner;
import java.util.Arrays;

class People {
    String name;
    String zip;
    String region;

    public People(String name, String zip, String region) {
        this.name = name;
        this.zip = zip;
        this.region = region;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        People[] people = new People[n];

        for(int i=0; i<n; i++) {
    
            String name = sc.next();
            String zip = sc.next();
            String region = sc.next();
            
            people[i] = new People(name, zip, region);
        }

        String[] arr = new String[n];
        for(int j=0; j<n; j++ ) {
            arr[j] = people[j].name;
        }

        Arrays.sort(arr);

        for(int k=0; k<n; k++) {
            if(arr[n-1].equals(people[k].name)) {
                System.out.println("name "+people[k].name);
                System.out.println("addr "+people[k].zip);
                System.out.println("city "+people[k].region);
            }
        }


    }
}