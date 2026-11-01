class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> dict = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      Integer temp = dict.get(target - nums[i]);
      if (temp != null) {
        return new int[] {temp, i};
      } else {
        dict.put(nums[i], i);
      }
    }
    return new int[] {-1, -1};
  }
}
