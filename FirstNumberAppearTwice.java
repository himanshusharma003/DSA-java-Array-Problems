import java.util.*;
public class FirstNumberAppearTwice {
    public static void main(String[] args) {
        int[] arr={4,2,7,2,9,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                System.out.println("Duplicate: "+arr[i]);
                break;
            }else{
                map.put(arr[i],1);

            }
        }
    }
    
}
