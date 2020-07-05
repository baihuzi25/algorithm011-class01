//利用Hash和小顶堆
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
       for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }//建立Hash映射
        PriorityQueue<Integer> heap = new PriorityQueue<>(
                ((o1, o2) -> map.get(o1) - map.get(o2))
        );//建立一个小顶堆
        for(int num : map.keySet()){
            heap.add(num);
            if(heap.size() > k) heap.poll();
        }
        int [] result = new int[heap.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = heap.poll();
        }
        return result;


    }
}