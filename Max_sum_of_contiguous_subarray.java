// import java.lang.*;
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    int prefixSum(int pf[],int i,int j){
        if(i==0){
            return pf[0];
        }
        else{
            return pf[j]-pf[i-1];
        }
    }
    public int maxSubArray(final int[] A) {
        //sample:A={1,2,3,4,-3,-2,-1} length=7
        //create a prefix maxSubArray
        int i,j;
        int n=A.length;
        int pf[]=new int [n];
        pf[0]=A[0];
        //create prefix array
        for(i=1;i<n;i++){
            pf[i]=pf[i-1]+A[i];
        }
        int sum=0;
        int ans=Integer.MIN_VALUE;
        //iterate every subarray
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                sum=prefixSum(pf,i,j);
                ans=Math.max(ans,sum);
                
            }
        }
        
        return ans;
    }
}
