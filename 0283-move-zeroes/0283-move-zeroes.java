class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> l=new LinkedList<>();
        int zerocount=0;
        for(int n:nums){
            if(n!=0)l.add(n);
            else zerocount++;
        }
        for(int i=0;i<zerocount;i++)l.add(0);
        int k=0;
        for(int n:l){
            nums[k]=n;
            k++;
        }
        
    }
}