class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int duplicate =0;
        int missing =1;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                duplicate = nums[i];
            }
            if(nums[i] ==missing){
                missing++;
            }
            
        }
        return new int[]{duplicate , missing};
    }
}