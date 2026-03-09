import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1: ");
        int num1=sc.nextInt();
        System.out.println("enter num2: ");
        int num2=sc.nextInt();
        System.out.println("enter num3: ");
        int num3=sc.nextInt();
        System.out.println("max num is: "+Max(num1,num2,num3));
        System.out.println("min num is: "+Min(num1,num2,num3));
        sc.close();

    }
    static int Max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }

     static int Min(int a, int b, int c){
        
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else{
            return c;
        }
    }
    

}
