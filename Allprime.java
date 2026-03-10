import java.util.Scanner;
public class Allprime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number: ");
        int a=sc.nextInt();
        System.out.println("enter second number: ");
        int b=sc.nextInt();
        primesbetween(a,b);
    }
    static void primesbetween(int a,int b){
        for (int i=a;i<=b;i++){
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}

