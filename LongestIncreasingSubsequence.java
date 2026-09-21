import java.util.*;
public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums , int n) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLength = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }

    public static void main(String[] args) {
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