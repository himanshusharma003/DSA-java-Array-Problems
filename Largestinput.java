import java.util.Scanner;
public class Largestinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num(0 to stop): ");
        
        int largest=0;
        while (true) {
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            if(num>largest){
                largest=num;
            }
            
        }
        System.out.println("largest number is: "+largest);
        sc.close();
    }
    
}
