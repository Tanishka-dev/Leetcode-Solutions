package Searching;
class Solution {
    public int mySqrt(int x) {
       if(x==0 || x==1)
           return x;
       long s=0,e=x-1;
        long ans=0;
        while(s<=e){
           long mid=s+(e-s)/2;
           long sqr=mid*mid;
            if(sqr==x){
                 ans=mid;
                break;
            }            
           else if(sqr<=x){
                s=mid+1;
               ans=mid;
            }else{
                e=mid-1;
            }
        }
        int ansL=(int)ans;
        return ansL;     
    }
}
