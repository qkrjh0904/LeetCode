class Solution {
    public boolean isPalindrome(String s) {

        boolean answer = true;

        List<Character> list = getList(s);
        System.out.println(list);

        int p1 = 0;
        int p2 = list.size()-1;

        while(p1<p2){
        // System.out.println(p1 + ", " +p2 + "= ("+list.get(p1)+", "+list.get(p2)+")");
            if(list.get(p1++) == list.get(p2--)){
                continue;
            }
            answer = false;
            break;
        }
        
        return answer;
    }

    public List<Character> getList(String s){
        s = s.replace(" ", "");
        s = s.toLowerCase();

        List<Character> list = new ArrayList<>();
        char[] array = s.toCharArray();
        for(int i=0; i<array.length; ++i){
            if((array[i] >= 'a' && array[i] <= 'z') || (array[i] >= '0' && array[i] <= '9')){
                list.add(array[i]);
            }
        }
        return list;
    }
}