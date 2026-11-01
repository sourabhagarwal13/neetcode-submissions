class Solution {
  public int longestConsecutive(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    Set<Integer> set = new HashSet<>();
    int maxResult = Integer.MIN_VALUE;
    int temp = 0;
    for (int i = 0; i < nums.length; i++) {
      set.add(nums[i]);
    }
    for (int i = 0; i < nums.length; i++) {
      int toFind = nums[i];
      if (set.contains(nums[i] - 1)) {
        continue;
      }
      while (set.contains(toFind)) {
        temp++;
        toFind++;
      }
      maxResult = Math.max(temp, maxResult);
      temp = 0;
    }
    return maxResult;
  }
}
