class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1=nums1.length;
        int n2=nums2.length;
        int[] merged=new int[n1+n2];
        int i=0,j=0,k=0;

        while(i<n1 && j<n2){
           if(nums1[i]<nums2[j]){
            merged[k]=nums1[i];
            i++;
          }   else{
                 merged[k]=nums2[j];
                 j++;
          }
        k++;
        }
        while(i<n1){
           merged[k]=nums1[i];
           i++;
           k++;
        }
        while(j<n2){
           merged[k]=nums2[j];
           j++;
           k++;
        }
        int total=n1+n2;
        if(total%2==1){
            return merged[total/2];
        }
        return (merged[total/2 -1]+ merged[total/2])/2.0;
    }
}

public class Main{
    public static void main(String[]args){
        int[] nums1={1,3};
        int[] nums2={2};
        Solution sol =new Solution();
        double result = sol.findMedianSortedArrays(nums1,nums2);
        System.out.println("Median = " +result);
    }
}