
import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age=sc.nextInt();
        System.out.println(Age(age));
        sc.close();

    }
    static String Age(int age){
        if(age>=18){
            return "Eligible for vote";
        }
        else{
            return "not eligible";
        }

    }
    
}
