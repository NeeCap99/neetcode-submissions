class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> found = new ArrayList<>();
        boolean flag = false;
        for(int i = 0; i<nums.length; i++){
            if(flag){
                break;
            }
            int curr = nums[i];
            for(int j = 0; j<found.size(); j++){
                if(curr==found.get(j)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                found.add(curr);
            }
        }
        if(flag){
            return true;
        }
        else{
            return false;
        }
    }
}