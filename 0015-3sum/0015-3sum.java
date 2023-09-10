class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=0; i<nums.length; ++i){
            int p1 = i+1;
            int p2 = nums.length-1;
            while(p1 < p2){
                int n1 = nums[i];
                int n2 = nums[p1];
                int n3 = nums[p2];

                int sum = n1 + n2 + n3;
                if(sum == 0){
                    set.add(List.of(n1, n2, n3));
                    p1++;
                    p2--;
                } else if(sum > 0){
                    p2--;
                } else{
                    p1++;
                }
            }
        }
        answer.addAll(set);
        return answer;
    }
}