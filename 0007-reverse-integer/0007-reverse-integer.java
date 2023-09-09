class Solution {
    public int reverse(int x) {
        if(x==0){
            return 0;
        }

        String s = String.valueOf(x);

        boolean isNegative = false;
        if(s.startsWith("-")){
            isNegative = true;
            s = s.replace("-", "");
        }

        StringBuffer sb = new StringBuffer(s);
        s = sb.reverse().toString();
        
        while(s.startsWith("0")){
            s = s.substring(1, s.length());
        }

        long num = Long.parseLong(s);
        if(isNegative){
            num *= -1;
        }
        
        int answer = 0;
        if(num <= Integer.MAX_VALUE && num >= Integer.MIN_VALUE){
            answer = (int) num;
        } 

        return answer;
        
    }
}