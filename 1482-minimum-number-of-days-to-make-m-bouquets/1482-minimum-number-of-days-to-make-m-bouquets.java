class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long totf=(long)m*k;
        if(totf>bloomDay.length){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;

        for(int day:bloomDay){
            low=Math.min(low,day);
            high=Math.max(high,day);
        }
        while(low<high){
            int cons=0;
        int b=0;
            int mid=low+(high-low)/2;
            for(int day:bloomDay){
                if(day<=mid){
                    cons++;
                    if(cons==k){
                        b++;
                        cons=0;
                    }
                }else{
                    cons=0;
                }
            }
            if(b>=m){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}