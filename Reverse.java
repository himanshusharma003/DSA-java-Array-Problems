import java.util.Scanner;
public class Reverse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        long num=sc.nextLong();
        long reversed=0;
        
        while(num>0){
            long remainder=num%10;
            
            reversed=(reversed*10)+remainder;
            num/=10;

        }
        
        System.out.println(reversed);

    }
}
