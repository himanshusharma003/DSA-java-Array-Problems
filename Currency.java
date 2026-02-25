
import java.util.Scanner;
public class Currency {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rupees: ");
        double rupees= sc.nextDouble();
        double usd=rupees/90;
        System.out.println("in dollars: "+usd);
        sc.close();

    }
    
}
