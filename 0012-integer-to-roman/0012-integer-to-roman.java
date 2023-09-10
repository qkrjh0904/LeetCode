class Solution {
    public String intToRoman(int num) {
        String answer = "";
        while(num != 0){
            if(num/1000 >= 1){
                answer = addString(num/1000, answer, "M");
                num -= (num/1000 * 1000);
                continue;
            } else if(num/900 >= 1) {
                answer = addString(num/900, answer, "CM");
                num -= (num/900 * 900);
                continue;
            }else if(num/500 >= 1) {
                answer = addString(num/500, answer, "D");
                num -= (num/500 * 500);
                continue;
            }else if(num/400 >= 1) {
                answer = addString(num/400, answer, "CD");
                num -= (num/400 * 400);
                continue;
            }else if(num/100 >= 1) {
                answer = addString(num/100, answer, "C");
                num -= (num/100 * 100);
                continue;
            }else if(num/90 >= 1) {
                answer = addString(num/90, answer, "XC");
                num -= (num/90 * 90);
                continue;
            }else if(num/50 >= 1) {
                answer = addString(num/50, answer, "L");
                num -= (num/50 * 50);
                continue;
            }else if(num/40 >= 1) {
                answer = addString(num/40, answer, "XL");
                num -= (num/40 * 40);
                continue;
            }else if(num/10 >= 1) {
                answer = addString(num/10, answer, "X");
                num -= (num/10 * 10);
                continue;
            }else if(num/9 >= 1) {
                answer = addString(num/9, answer, "IX");
                num -= (num/9 * 9);
                continue;
            }else if(num/5 >= 1) {
                answer = addString(num/5, answer, "V");
                num -= (num/5 * 5);
                continue;
            }else if(num/4 >= 1) {
                answer = addString(num/4, answer, "IV");
                num -= (num/4 * 4);
                continue;
            }else {
                answer = addString(num, answer, "I");
                num = 0;
            }
        }
        return answer;
    }

    public String addString(int num, String answer, String roman){
        for(int i=0; i<num; ++i){
            answer += roman;
        }
        return answer;
    }

}