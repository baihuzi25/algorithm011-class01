//BFS
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(wordList == null || wordList.size() == 0) return 0;
        Set<String> set = new HashSet<>();
        for(int i = 0; i < wordList.size(); i++) {
            set.add(wordList.get(i));
        }
        if(!set.contains(endWord)) return 0;
        boolean[] visited = new boolean[wordList.size()];
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int res = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();   
            res++;       
            for(int i = 0; i < size; i++) {
               String temp = queue.poll();
                if(temp.equals(endWord)) return res;
                for(int j = 0; j < wordList.size(); j++) {
                    if(visited[j]) continue;
                    if(isValid(temp, wordList.get(j))) {
                        queue.add(wordList.get(j));
                        visited[j] = true;
                    }
                }
            }
        }
        return 0;
    }
    

    private boolean isValid(String temp, String word) {
        int cnt = 0;
        for(int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) == word.charAt(i)) {
                    cnt++;
            }
        }
        return cnt == temp.length()-1;
    }
}