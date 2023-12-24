class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        int len = nums.length;
        if(len==0){
            return answer;
        }
        if(len==1){
            answer.add(String.format("%d", nums[0]));
            return answer;
        }

        int start = nums[0];
        for(int i=1; i < len; ++i){
            if((nums[i] - nums[i-1]) != 1){
                if(start == nums[i-1]){
                    answer.add(String.format("%d", start));
                }else{
                    answer.add(String.format("%d->%d", start, nums[i-1]));
                }
                start = nums[i];
                if(i == len-1){
                    answer.add(String.format("%d", start));
                }
                continue;
            }
            if(i == len-1){
                answer.add(String.format("%d->%d", start, nums[i]));
            }
        }
        
        return answer;
    }
}