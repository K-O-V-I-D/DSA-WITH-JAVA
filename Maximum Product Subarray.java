class Solution {
    public int maxProduct(int[] nums) {
         int currentPro=Integer.MIN_VALUE;
        int prevPro=1;

        for(int i =0; i<nums.length; i++){
            prevPro*=nums[i];
          
            if(prevPro> currentPro){
                currentPro=prevPro;
            }
            if(prevPro<0){
                prevPro=1;
            }
        }
      
        return currentPro;
    }
}
