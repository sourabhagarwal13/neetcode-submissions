class Solution {
    public boolean isAnagram(String s, String t) {
    //O(m+n)
    //O(m)
    Map<Character,Integer> dict1=new HashMap<>();

    for(Character ch:s.toCharArray()){
        if(dict1.get(ch)==null){
            dict1.put(ch,1);
        }else{
            dict1.put(ch,dict1.get(ch)+1);
        }
    }
    for(Character ch:t.toCharArray()){
        if(dict1.get(ch)!=null){
            dict1.put(ch,dict1.get(ch)-1);
        }else{
            return false;
        }
    }
    for(Integer i:dict1.values()){
        if(i!=0){
            return false;
        }
    }
    return true;
   
}
}
