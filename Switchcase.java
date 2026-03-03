
import java.util.Scanner;

public class Switchcase {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        long a=sc.nextLong();
        System.out.println("enter a number:");
        long b=sc.nextLong();
        System.out.println("enter an operator:");
        char op=sc.next().trim().charAt(0);
        switch(op){
            case '+':
                System.out.println("sum is:"+(a+b));
                break;
            case '-':
                System.out.println("substraction is:"+(a-b));
                break;
            case '*':
                System.out.println("product is:"+(a*b));
                break;
            case '/':
                if(b==0){
                    System.out.println("division by zero error");

                }
                else{ 
                    System.out.println("dividion is:"+(a/b));

                }
                break;
               
            default:
                System.out.println("enter a valid input");



        }
        
    }
}
