class Solution {
    public String reverseWords(String s) {
        String[] temp = s.trim().split(" +");
        Collections.reverse(Arrays.asList(temp));
        return String.join(" ", temp); 

    }
}