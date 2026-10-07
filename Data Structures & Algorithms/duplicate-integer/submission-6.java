class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        int temp = 0;
        for(int i = 0; i<nums.length; i++){
            temp = nums[i];
            if(h1.containsKey(temp)){
                return true;
            }
            else{
                h1.put(temp, 1);
            }
        }
        return false;
    }
}