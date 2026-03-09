import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of days in august month: ");
        int days= sc.nextInt();
        int counteven=0;
        for(int i=1;i<=days;i++){
            if(i%2==0){
                counteven++;
            }
        }
        System.out.println("no of days he is allowed to go with his friends is: "+counteven);
        sc.close();

    }
    
}
