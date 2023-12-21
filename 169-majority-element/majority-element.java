class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int k = n/2;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; ++i){
            int num = nums[i];
            if(!map.containsKey(num)){
                map.put(num, 1);
                continue;
            }
            map.put(num, map.get(num)+1);
        }
        
        int answer = 0;
        Iterator<Integer> keyIter = map.keySet().iterator();
        while(keyIter.hasNext()){
            int key = keyIter.next();
            if(map.get(key) > k){
                answer = key;
                break;
            }
        }
        return answer;
    }
}