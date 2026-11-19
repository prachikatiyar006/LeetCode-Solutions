class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum = sum + nums[i];
        }
        double max = sum;
        int index =0;
        for(int i=k;i<nums.length;i++){            
            sum= sum+nums[i] - nums[index];
            index++;
            if(sum>max){
            max=sum;
            }
        }
        return max/k;
       
    
    }
}