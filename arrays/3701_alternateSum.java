//leetcode : Alternating  sum
//Approach : Iterative,pair-wise alternating sum
// time complexity : o(n)
// space complexity : o(1)

class Solution {
    public int alternatingSum(int[] nums) {
        int len=nums.length;
        int result=0;

        if (len==1){
            return nums[0];
        }
        else if (len==2){
            return nums[0]-nums[1];
        }
        else{
            int i;
            for(i=0;i<len-1;i+=2){
                result+=nums[i]-nums[i+1];
                 }
            if(len %2 !=0){
                result=result+nums[len-1];
            }
        }
        return result;
    }
}