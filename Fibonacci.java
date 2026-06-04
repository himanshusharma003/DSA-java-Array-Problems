
// import java.util.Scanner;
// public class Fibonacci{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the first number:");
//         int a= sc.nextInt();
//         System.out.println("enter the second number:");
//         int b= sc.nextInt();
//         System.out.println("enter the third number:");
//         int c= sc.nextInt();
//         if(a>b && a>c){
//             System.out.println("a is greater");
//         }
//         else if(b>a && b>c){
//             System.out.println("b is greater");
//         }
//         else if(c>a && c>b){
//             System.out.println("c is greater");
//         }
//         sc.close();
        
    
        
import java.util.Scanner;
public class Fibonacci{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       System.out.println("enter a number:");
       int n=sc.nextInt();
       int a=0;
       int b=1;
       for(int i=1;i<10;i++){
          System.out.println(a +" ");
          int next=a+b;
          a=b;
          b=next;
          sc.close();
       }
        
    }
}


 



