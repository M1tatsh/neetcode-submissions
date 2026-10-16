class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int partner = target - nums[i];
            if (seen.containsKey(partner))
                return new int[]{
                    seen.get(partner), 
                    i
                };
            seen.put(nums[i], i);
        }

        return new int[0];
    }
}
