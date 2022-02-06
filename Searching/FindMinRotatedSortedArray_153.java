class Solution {
    public int findMin(int[] nums) {
        int ans=find(nums);
        if(ans==-1)
            return nums[0];
        return ans;
    }
    
    int find(int[] nums){
         int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid<e && nums[mid]>nums[mid+1])
                return nums[mid+1];
            if(mid>s && nums[mid]<nums[mid-1])
                return nums[mid];
            if(nums[mid]<=nums[s])
                e=mid-1;
            else
                s=mid+1;
                
        }
        return -1;
    }
}