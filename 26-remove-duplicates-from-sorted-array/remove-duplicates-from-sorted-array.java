class Solution {
    public int removeDuplicates(int[] nums) {
        
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<len; ++i){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        Collections.sort(list);

        for(int i=0; i<list.size(); ++i){
            nums[i] = list.get(i);
        }

        return list.size();
    }
}