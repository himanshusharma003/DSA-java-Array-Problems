import java.util.Scanner;
public class Areaofcircle{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius: ");
        double r=sc.nextInt();
        double Area=Math.PI*r*r;
        System.out.println(Area);
        sc.close();

    }
}