import java.util.Scanner;;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers(0 to exit): ");
        
        double sum=0;
        int count=0;

        while(true){
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            sum=sum+num;
            count++;
            



        }
        if(count>0){
            double Average=sum/count;
            System.out.println("average is: "+Average);

        
        }
        sc.close();
    
    }
}