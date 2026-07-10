class Solution {
    public int removeElement(int[] nums, int val) {
        int g=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[g]=nums[i];
                g++;
            }
        }
        return g;
    }
}