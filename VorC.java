import java.util.Scanner;
public class VorC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an alphabet: ");
        char alpha=sc.next().trim().charAt(0);

        if(!Character.isLetter(alpha)){
            System.out.println("wrong input");

        }

        else if(alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u' || alpha=='A' || alpha=='E' || alpha=='I' || alpha=='O' || alpha=='U'){
            System.out.println("its a vowel");
        }
        else{
            System.out.println("its consonant");
        }
        sc.close();
    }
    
}
