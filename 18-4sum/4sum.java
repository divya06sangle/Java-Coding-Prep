import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                Set<Long> seen = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    long needed = (long) target - nums[i] - nums[j] - nums[k];
                    if (seen.contains(needed)) {
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], (int) needed, nums[k]);
                        Collections.sort(quad);  // to avoid duplicates
                        result.add(quad);
                    }
                    seen.add((long) nums[k]);
                }
            }
        }

        return new ArrayList<>(result);
    }
}
