class Solution {
    public int search(int[] nums, int target) {
       int mid=0,start=0,end=nums.length-1;
        
       int pivot=findmax(nums);
       if(pivot==-1){
           return binarysearch(nums,target,start,end);
       }
        
       if(nums[pivot]==target){
           return pivot;
       }
       
        if(target>=nums[0]){
           return binarysearch(nums,target,start,pivot-1);
        }
        
        return binarysearch(nums,target,pivot+1,nums.length-1); 
        
}
    
    static int findmax(int nums[]){   
        int mid=0,start=0,end=nums.length-1;
        while(start<end){
            mid=start+(end-start)/2; 
            if(mid<end &&  nums[mid]>nums[mid+1])
                return mid;
             if(mid> start && nums[mid]<nums[mid-1])
                return mid-1;
             if(nums[start]>=nums[mid])
                end=mid-1;
              else
                start=mid+1;
    }
        return -1;
    }
    
    int binarysearch(int nums[],int target, int start, int end){
        int mid=0;
        while(start<=end){
               mid=start+(end-start)/2;
               if(nums[mid]>target)
                   end=mid-1;
               else if(nums[mid]<target)
                   start=mid+1;
               else 
                   return mid;
           }
        return -1;
    }
}