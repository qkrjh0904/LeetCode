/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode now1 = l1;
        ListNode now2 = l2;
        List<Integer> list = new ArrayList<>();

        while(true){
            if(Objects.isNull(now1) && Objects.isNull(now2)){
                break;
            }

            int val1 = Objects.isNull(now1) ? 0 : now1.val;
            int val2 = Objects.isNull(now2) ? 0 : now2.val;

            list.add(val1 + val2);

            now1 = Objects.isNull(now1) ? null : now1.next;
            now2 = Objects.isNull(now2) ? null : now2.next;
        }

        // System.out.println(list);
        calculate(list);
        // System.out.println(list);
        return getResult(list, list.size()-1, null);
    }

    public ListNode getResult(List<Integer> list, int index, ListNode parent){
        if(index < 0){
            return parent;
        }

        return getResult(list, index-1, new ListNode(list.get(index), parent));
    }

    public void calculate(List<Integer> list){
        int carry = 0;
        for(int i=0; i<list.size(); ++i){
            
            int num = list.get(i) + carry;
            carry = 0;

            if(num > 9){
                carry = 1;
                num %= 10;
            }

            list.set(i, num);
        }

        if(carry == 1){
            list.add(carry);
        }
    }

    
}