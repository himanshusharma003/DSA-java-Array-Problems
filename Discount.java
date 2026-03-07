import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the original prize of an item: ");
        int item=sc.nextInt();
        System.out.println("enter the available discount in percentage: ");
        double dp=sc.nextInt();
        double discount=(item*dp)/100;
        System.out.println("the discount is: "+discount);


    }
    
}
