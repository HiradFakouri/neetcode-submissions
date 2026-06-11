class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int total = 0;
        int max = 0;
        for (int i = 0; i<nums.length; i++) {
           if (nums[i] == 1) {
                total += 1;
           }else {
                if (total > max) {
                    max = total;
                }
                total = 0;
           }
        }

        if (total > max) {
            max = total;
         }

        return max;
    }
}