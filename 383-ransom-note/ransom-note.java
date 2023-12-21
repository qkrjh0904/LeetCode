class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int ransomNoteLen = ransomNote.length();
        int magazineLen = magazine.length();
        if(ransomNoteLen > magazineLen){
            return false;
        }

        boolean answer = true;

        String[] arr1 = ransomNote.split("");
        String[] arr2 = magazine.split("");

        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<magazineLen; ++i){
            String s = arr2[i];
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
                continue;
            }
            map.put(s, 1);
        }

        for(int i=0; i<ransomNoteLen; ++i){
            String s = arr1[i];
            if(map.containsKey(s) && map.get(s)>0){
                map.put(s, map.get(s)-1);
                continue;
            }
            answer = false;
            break;
        }

        return answer;
    }

}