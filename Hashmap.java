import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        int[] arr={2,3,2,5,3,2,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int frequency=map.getOrDefault(num,0); //it is used to get the frequency of the num for ex num=1 so initially map is empty so it will return the freq 0 if its present in map so it will return its frequency but not 0
            frequency=frequency+1;
            map.put(num,frequency);
        }
        System.out.println(map);
    }
    
}
