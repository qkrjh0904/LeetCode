class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        if(arr1.length==0){
            return true;
        }
        if(arr2.length==0){
            return false;
        }
        int idx = 0;
        for(int i=0; i<arr2.length; ++i){
            if(idx >= arr1.length){
                break;
            }
            if(arr1[idx] == arr2[i]){
                idx++;
            }
        }
        return idx == arr1.length;
    }
}