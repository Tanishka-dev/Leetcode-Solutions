class Solution {
    public boolean isGoodArray(int[] nums) {
        int result=0;
      for(int element: nums){
          result=gcd(result,element);
          if(result==1)
              return true;
        
      }
        return false;
        
    }
    int gcd(int result, int element){
        if(result==0)
            return element;
        else
            return gcd(element%result,result);
    }
}