import java.util.Scanner;


public class Function {
    public static void main(String[]args){
        sum();
        sum();
    }

    static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a=sc.nextInt();
        System.out.println("enter the second number: ");
        int b=sc.nextInt();
        System.out.println("the sum is: "+(a+b));

    }
}

