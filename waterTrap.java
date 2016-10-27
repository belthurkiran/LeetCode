public class waterTrap {
    public int trap(int[] height) {
        int water=0;
        int level = 0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            if(height[i]<height[j]){
                level=Math.max(height[i],level);
                water+=level-height[i];
                i++;
            }
            else{
                level=Math.max(height[j],level);
                water+=level-height[j];
                j--;
            }
        }
        return water;
    }
}
