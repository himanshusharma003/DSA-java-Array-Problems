import java.util.Scanner;
public class Natural {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n natural number: ");
        int n=sc.nextInt();
        int Sum=0;
        for(int i=1;i<=n;i++){
            Sum=Sum+i;

        }
        System.out.println("the sum of n natural number is: "+Sum);
        sc.close();
       
    }

    
}
