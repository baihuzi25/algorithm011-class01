//暴力解法
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         char[] a = s.toCharArray();
//         char[] b = t.toCharArray();
//         Arrays.sort(a);
//         Arrays.sort(b);
//         String a1 = Arrays.toString(a);
//         String a2 = Arrays.toString(b);
//         return (a1.equals(a2));
//     }
// }


//HashMap(低效的做法)
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()) {
//             return false;
//         }
//         Map<Character,Integer> map1 = new HashMap<>();
//         Map<Character,Integer> map2 = new HashMap<>();
//         for (int i = 0; i<s.length(); i++) {
//             map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
//             map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);
//         }
       
//         return map1.equals(map2);
//     }

// }

//数组代替HashMap
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        int[] temp = new int[26];
        for (int i = 0; i<s.length(); i++) {
            temp[s.charAt(i)-'a']++;
            temp[t.charAt(i)-'a']--;
        }
        for (int j : temp) {
            if(j!=0) {
                return false;
            }
        }
        return true;
    }
}