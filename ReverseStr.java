import java.util.Scanner;
public class ReverseStr {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String text=sc.nextLine();
        String reversed= "";
        for(int i=text.length()-1;i>=0;i--){
            reversed = reversed+text.charAt(i);
            
        }
        System.out.println("Reversed String: "+reversed);
        if(text.equals(reversed)){
            System.out.println("the input text is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    
}
