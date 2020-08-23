//第一种方法
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }      
        List<List<String>> list1 = new ArrayList<>();
       Map<String,List>  map = new HashMap<>();
       for (String s : strs) {
           char[] ca = s.toCharArray();
           Arrays.sort(ca);  
           String key = String.valueOf(ca);
           if (!map.containsKey(key)) {
               map.put(key, new ArrayList());
               map.get(key).add(s);
           }else {
               map.get(key).add(s);
            }
       }
       for (List list2 :map.values()){
           list1.add(list2);
       }
        return list1;
    //    return new ArrayList(map.values());
    }
   
}
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         if (strs.length == 0) return new ArrayList();
//         Map<String, List> ans = new HashMap<String, List>();
//         for (String s : strs) {
//             char[] ca = s.toCharArray();
//             Arrays.sort(ca);
//             String key = String.valueOf(ca);
//             if (!ans.containsKey(key)) ans.put(key, new ArrayList());
//             ans.get(key).add(s);
//         }
//         return new ArrayList(ans.values());
//     }
// }