public class PeekElement {
    public int findPeakElement(int[] nums) {
        int n =nums.length;
        if(n<=0){
            return -1;
        }
        double prev = Double.NEGATIVE_INFINITY;
        double next = Double.NEGATIVE_INFINITY;
        for(int i=0;i<nums.length;i++){
            prev = Double.NEGATIVE_INFINITY;
            next = Double.NEGATIVE_INFINITY;
            if(i-1>=0){
                prev=nums[i-1];
            }
            if(i+1<n){
                next=nums[i+1];
            }
            if(nums[i]>prev && nums[i]>next){
                return i;
            }
        }
        return -1;
    }
}
