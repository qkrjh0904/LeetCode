class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
        int len = prices.length;
        if(len == 1){
            return answer;
        }

        
        int p1 = 0;
        int p2 = 1;
        while(p2 < len){
            int price1 = prices[p1];
            int price2 = prices[p2];

            int diff = price2 - price1;
            answer = Math.max(answer, diff);
            System.out.println(p1+","+p2+","+diff+","+answer);
            if(diff <= 0){
                p1 = p2;
            }
            p2++;
        }
        return answer;
    }
}