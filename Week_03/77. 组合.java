
//»ØËİ·½·¨£¨µİ¹é£©
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if(n <= 0 || k <= 0 || n < k) {
            return result;  
        }
         mycombine(n, k, 1, new ArrayList<Integer>());
        return result;
    }
    private void mycombine(int n, int k, int first, List<Integer> list ) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        } 
        for(int i = first; i <= n; i++) {
            list.add(i);
            mycombine(n, k, i+1, list);
            list.remove(list.size()-1);
        }

    }
}