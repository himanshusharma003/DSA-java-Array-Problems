
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();
        System.out.println("the factors of"+num +"are: ");
        int divisor=1;
        while(divisor<=num) {
            if(num%divisor==0){
                System.out.println(divisor+" ");
            }
            divisor++;
            
        }
        
        
        
        sc.close();
    }
    
}
