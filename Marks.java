import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks: ");
        int marks=sc.nextInt();
        System.out.println("your grade is: "+Result(marks));
        sc.close();
    
    }
    static String Result(int marks){
        if(marks<1 || marks>100){
            return "enter valid marks";
        }
        else if(marks>90 ){
            return "AA";
        }
         else if(marks>80 && marks<=90 ){
            return "AB";
        }
         else if(marks>=71 && marks<=80 ){
            return "BB";
        }
         else if(marks>=61 && marks<=70 ){
            return "BC";
        }
         else if(marks>=51 && marks<=60 ){
            return "CD";
        }
         else if(marks>=41 && marks<=50 ){
            return "DD";
        }
        else{
            return "Fail";
        }
    }
    
}
