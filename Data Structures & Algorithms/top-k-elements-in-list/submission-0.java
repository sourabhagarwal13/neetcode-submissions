class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    Map<Integer, List<Integer>> topFreq = new TreeMap<>(Comparator.reverseOrder());
    // int [] freq=new int[2000];
    int[] result = new int[k];
    for (int i = 0; i < nums.length; i++) {
      Integer freqVal = freq.get(nums[i]);
      if (freqVal != null) {
        freq.put(nums[i], freqVal + 1);
      } else {
        freq.put(nums[i], 1);
      }
    }
    freq.forEach(
        (key, value) -> {
          List<Integer> list = topFreq.get(value);
          if (list == null) {
            list = new ArrayList<>();
          }
          list.add(key);
          topFreq.put(value, list);
        });
    int count = 0;
    for (List<Integer> list : topFreq.values()) {
      if (count == k) {
        return result;
      }
      for (Integer i : list) {
        result[count] = i;
        count++;
      }
    }
    return result;
  }
}
