class Solution {
    public void sortColors(int[] nums) {
        int q = nums.length;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t; 
                }
            }
        }
    }
}