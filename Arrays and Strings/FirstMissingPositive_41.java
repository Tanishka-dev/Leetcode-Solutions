/*41. First Missing Positive
Hard 
Given an unsorted integer array nums, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses constant extra space.

*/
import java.util.Arrays;
class Solution{
    public int firstMissingPositive(int[] nums) {
        int count=0,j=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>1){
                count++;
            }
        }
        if(count==nums.length)
            return 1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(j==nums[i]){
                j++;
            }
        }
        return j;
        
    }
}