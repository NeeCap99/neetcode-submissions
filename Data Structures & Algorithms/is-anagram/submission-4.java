class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        for(Character temp1 : s.toCharArray()){
            h1.merge(temp1, 1, Integer::sum);
        }
        for(char temp2 : t.toCharArray()){
            h2.merge(temp2, 1, Integer::sum);
        }
        return h1.equals(h2);
    }
}
