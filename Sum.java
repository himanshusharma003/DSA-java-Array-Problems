import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num(0 to stop): ");
        
        int sum=0;
        while (true) {
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            sum=sum+num;
        }
        System.out.println("sum is: "+sum);
        sc.close();
    }
    
}
