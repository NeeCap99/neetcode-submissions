class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        int[] ans = new int[2];
        int temp;
        for(int i = 0; i<nums.length; i++){
            temp = target - nums[i];
            if(h1.containsKey(temp)){
                if(i<h1.get(temp)){
                    ans[0] = i;
                    ans[1] = h1.get(temp);
                }
                else{
                    ans[0] = h1.get(temp);
                    ans[1] = i;
                }
                return ans;
            }
            else{
                h1.put(nums[i], i);
            }
        }
        return ans;
    }
}
