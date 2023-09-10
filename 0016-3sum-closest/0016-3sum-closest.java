class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int answer = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; ++i){
            int p1 = i+1;
            int p2 = nums.length-1;

            while(p1 < p2){
                int n1 = nums[i];
                int n2 = nums[p1];
                int n3 = nums[p2];

                int sum = n1 + n2 + n3;
                if(sum == target){
                    return sum;
                } else if(sum > target){
                    p2--;
                } else{
                    p1++;
                }
                // System.out.println(n1 +" + " + n2 + " + " + n3 + " = " +sum);

                answer = Math.abs(sum-target) < Math.abs(answer-target) ? sum : answer;
            }
        }
        return answer;
    }
}