import java.util.Arrays;
public class Varargs {
    public static void main(String[] args) {
        fun(1,2,56,5,4,8,90);
        
    }
    static void fun(int ...x){
        System.out.println(Arrays.toString(x));
    }
}
