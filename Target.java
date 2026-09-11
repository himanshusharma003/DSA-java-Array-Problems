import java.util.*;
public class Target {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,2,5};
        int target=2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
            int frequency=map.getOrDefault(target,0);
            frequency=frequency+1;
            map.put(target,frequency);
           }

        }
        System.out.println(map);
        
    }
}
/*or for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            if(map.containsKey(target)){
                map.put(target,map.get(target)+1);
            }else{
                map.put(target,1)
            }
        }
    }
    System.out.println(map);
*/
