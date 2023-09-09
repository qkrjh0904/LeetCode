class Solution {
    public int maxArea(int[] height) {
        

        int left = 0;
        int right = height.length-1;
        int answer = 0;

        while(left != right){
            int hLeft = height[left];
            int hRight = height[right];
            
            int width = right - left;
            int minHeight = Math.min(hLeft, hRight);
            answer = Math.max(answer, width*minHeight);

            if(hLeft > hRight){
                right--;
            } else{
                left++;
            }
        }

        return answer;
    }
}