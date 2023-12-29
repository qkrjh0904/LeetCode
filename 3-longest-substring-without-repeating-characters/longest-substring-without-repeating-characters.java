class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(" ") || s.length()==1){
            return 1;
        }

        if(s.length()==0){
            return 0;
        }

        String[] array = s.split("");

        int answer = 0;
        for(int i=0; i<array.length; ++i){
            Set<String> set = new HashSet<>();
            for(int j=i; j<array.length; ++j){
                String alphabet = array[j];
                if(set.contains(alphabet)){
                    answer = Math.max(answer, set.size());
                    break;
                }
                set.add(alphabet);
            }
            answer = Math.max(answer, set.size());
        }
        return answer;
    }
}