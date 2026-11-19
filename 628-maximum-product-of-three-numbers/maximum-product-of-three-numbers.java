class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int prd1=nums[n-1]*nums[n-2]*nums[n-3];
        int prd2=nums[0]*nums[1]*nums[n-1];
        int ans=Math.max(prd1,prd2);
        return ans;

        
    }
}