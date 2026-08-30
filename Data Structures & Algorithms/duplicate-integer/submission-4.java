class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> present = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(present.containsKey(nums[i])){
                return true;
            }
            else{
                present.put(nums[i], true);
            }
        }
        return false;
    }
}