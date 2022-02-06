class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans= {-1,-1};
        int start=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                start=i;
                ans[0]=i;
                break;
            }
        }
        for(int j=start;j<nums.length;j++){
            if(nums[j]==target){
                ans[1]=j;
            }
        }
        return ans;
        
    }
}