import java.util.Scanner;

public class Occuring {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers: ");
        long numbers=sc.nextLong();
        System.out.println("which number: ");
        int number=sc.nextInt();
        int count=0;
        while(numbers>0){
            int reminder=(int)(numbers%10);//or just long remainder no need to type cast
            if(reminder==number){
                count++;

            }
            numbers/=10; //numbers=numbers/10
        }
        System.out.println("number of times it occurs: "+count);
        sc.close();

    }
    
}
