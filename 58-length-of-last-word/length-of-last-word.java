class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        String answer = arr[arr.length-1];
        return answer.length();
    }
}