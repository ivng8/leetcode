class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> book = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i += 1) {
            if (book.containsKey(target - nums[i])) {
                int[] ans = {book.get(target - nums[i]), i};
                return ans;
            } else {
                book.put(nums[i], i);
            }
        }
        int[] ans = {};
        return ans;
    }
}
