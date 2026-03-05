
import java.util.Scanner;
public class Armstrong {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();
        int original=a;
        int sum=0;
        while(a>0){
            int rem=a%10;
            a/=10;   //in modulo if number is less than 10 then the remainder will be the number itself
            int cube=rem*rem*rem;
            sum+=cube;
        }
        if(sum==original){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not an armstrong number");

        }
        
    }
}
