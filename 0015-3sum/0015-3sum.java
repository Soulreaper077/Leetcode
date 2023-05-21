class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            int target = -1 * nums[i];
            HashSet<Integer> set = new HashSet<>();
            for(int j = i + 1; j < nums.length; j++) {
                if(set.contains(target - nums[j]))
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], target - nums[j])));
                set.add(nums[j]);
            }
        }
        
        return new ArrayList<>(res);
    }
}