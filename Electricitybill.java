
import java.util.Scanner;
public class Electricitybill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the unit of electricity consumed: ");
        int units=sc.nextInt();
        int Electricitybill=0;
        int charge=0;
        if(units>=1 && units<=100){
            charge=10*units;
            Electricitybill=charge;
            System.out.println("electricity bill is: "+Electricitybill);
        }
        if(units>=101 && units<=200){
            charge=15*units;
            Electricitybill=charge;
            System.out.println("electricity bill is: "+Electricitybill);
        }
        if(units>=201 && units<=300){
            charge=20*units;
            Electricitybill=charge;
            System.out.println("electricity bill is: "+Electricitybill);
        }
        if(units>=300){
            charge=25*units;
            Electricitybill=charge;
            System.out.println("electricity bill is: "+Electricitybill);
        }
        sc.close();
    }
    
}
