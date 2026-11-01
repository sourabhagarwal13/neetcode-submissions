class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    List<Integer>[] topFreq = new ArrayList[10_001];
    // Map<Integer,List<Integer>> topFreq=new TreeMap<>(Comparator.reverseOrder());
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
          List<Integer> list = topFreq[value];
          if (list == null) {
            list = new ArrayList<>();
          }
          list.add(key);
          topFreq[value] = list;
        });
    int count = 0;
    for (int i = 10_000; i > 0; i--) {
      if (count == k) return result;
      List<Integer> list = topFreq[i];
      if (list == null) continue;
      for (int j : list) {
        result[count] = j;
        count++;
      }
    }
    /*  int count=0;
    for(List<Integer> list:topFreq.values()){
        if(count==k){
            return result;
        }
        for(Integer i:list){
            result[count]=i;
            count++;
        }
    }*/
    return result;
  }
}
