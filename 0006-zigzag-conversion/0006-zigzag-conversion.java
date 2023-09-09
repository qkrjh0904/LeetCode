class Solution {
    public String convert(String s, int numRows) {
        
        String[] arr = s.split("");
        Map<Integer, String> map = new HashMap<>();

        int row = 1;
        boolean up = true;
        for(int i=0; i<arr.length; ++i){

            if(map.containsKey(row)){
                map.put(row, map.get(row) + arr[i]);
            } else{
                map.put(row, arr[i]);
            }

            
            if(up){
                row++;
                if(row == numRows){
                    up = false;
                }
            } else{
                row--;
                if(row == 1){
                    up = true;
                }
            }
        }

        String answer = "";
        for(Integer key : map.keySet()){
            answer += map.get(key);
        }
        return answer;
    }
}