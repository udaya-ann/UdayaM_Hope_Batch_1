class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;

        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }

        while(low<high){
            int mid=low+(high-low)/2;
            int currw=0;
            int reqd=1;
            for(int w:weights){
                if(currw+w>mid){
                    reqd++;
                    currw=0;
                }
                currw+=w;
            }
            if(reqd<=days){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;

    }
}