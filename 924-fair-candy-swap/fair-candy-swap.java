class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alicesum=0;
        int bobsum=0;
        for(int i=0;i<aliceSizes.length;i++){
            alicesum += aliceSizes[i];
        }
        for(int j=0;j<bobSizes.length;j++){
            bobsum += bobSizes[j];
        }
        int dif=alicesum - bobsum;
        int target = dif/2;

        for(int i=0;i<aliceSizes.length;i++){
            int alicevalue =aliceSizes[i] ;
            int bobvalue =alicevalue - target;
            for(int j=0;j<bobSizes.length; j++){
                if(bobvalue == bobSizes[j]){
                    return new int[]{alicevalue, bobvalue};
                }
            }
        }return new int []{};        
    }
}