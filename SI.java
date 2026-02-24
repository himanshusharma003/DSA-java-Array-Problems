import java.util.Scanner;
public class SI{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principal: ");
        double p=sc.nextDouble();
        System.out.println("enter rate: ");
        double r=sc.nextDouble();

        System.out.println("enter time: ");
        double n=sc.nextDouble();

        double si=(p*r*n)/100;
        System.out.println("Simple Interest is: "+si);

        sc.close();

    

    }
}