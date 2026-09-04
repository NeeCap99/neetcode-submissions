class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            h1.put(nums[i], i);
        }

        int[] ans = new int[2];
        int temp;
        for(int j = 0; j<nums.length; j++){
            temp = target - nums[j];
            if(h1.containsKey(temp) && h1.get(temp)!=j){
                if(j<h1.get(temp)){
                    ans[0] = j;
                    ans[1] = h1.get(temp);
                }
                else{
                    ans[0] = h1.get(temp);
                    ans[1] = j;
                }
                return ans;
            }
        }
        return ans;
    }
}
