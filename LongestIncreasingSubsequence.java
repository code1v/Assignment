import java.util.*;
public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums, int n){
        int[] arr=new int[n];
        int count=0;

        for(int i : nums){
            int start=0;
            int end = count;

            while(start<end){
                int mid=(start+end)/2;
                if(arr[mid]<i){
                    start=mid+1;
                }else{
                    end=mid;
                }
            }

            arr[start]=i;
            if(start==count){
                count++;
            }
        }

        return count;
    }

    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Length of Longest Increasing Subsequence: " + lengthOfLIS(nums,n));
    }
}