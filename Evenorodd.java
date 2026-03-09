import java.util.Scanner;
public class Evenorodd {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a num: ");
        int num = sc.nextInt();
        System.out.println("the num is: "+Check(num));
        sc.close();
    }
    static String Check(int a){
        if(a%2==0){
            return "the num is even";
        }
        else{
            return "the num is odd";
        }
    }
    
}
