class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> tempResult=new HashMap<>();
        List<List<String>> result=new ArrayList<>();
        for(String str:strs){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            List<String> list=tempResult.get(key);
            if(list==null){
                list=new ArrayList<>();
            }
            list.add(str);
            tempResult.put(key,list);
        }
    for(List<String> temp:tempResult.values()){
        result.add(temp);
    }
    return result;
    }
}
