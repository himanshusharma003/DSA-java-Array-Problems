import java.util.Scanner;
public class Calculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        double a=sc.nextDouble();
        System.out.println("enter the second number: ");
        double b=sc.nextDouble();

        System.out.println("enter an operator: ");
        char operator=sc.next().charAt(0);

        if(operator=='+'){
            System.out.println("addition: "+(a+b));
        }
        else if(operator=='-'){
            System.out.println("substration: "+(a-b));
        }
        else if(operator=='*'){
            System.out.println("multiplication: "+(a*b));
        }
        else if(operator=='/'){
            System.out.println("addition: "+(a/b));
        }
        else{
            System.out.println("invalid syntax");
        }

        sc.close();
     }
}
        

        

        

    


