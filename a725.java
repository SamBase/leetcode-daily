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
import java.lang.Math;
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int noOfElements = 0;
        ListNode currentHead = head;
        ListNode[] answerArray = new ListNode[k];
        while(currentHead != null){
            currentHead = currentHead.next;
            noOfElements++;
        }
        currentHead = head;
        // System.out.println(noOfElements); //remove
        
        float LLQuantity = noOfElements/(float)k;
        int low = (int)Math.floor(LLQuantity);
        int high = (int)Math.ceil(LLQuantity);
        // System.out.println(LLQuantity); //remove
        // System.out.println(low); //remove
        // System.out.println(high); //remove

        int noOfheighs = noOfElements%k;
        // System.out.println("noOfheighs"+noOfheighs); //remove
        
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            if(i<noOfheighs) arr[i]=high;
            else arr[i]=low;
        }
        // System.out.println(Arrays.toString(arr)); //remove
        
        for(int i=0;i<arr.length;i++){
            ListNode newLL = new ListNode();
            int split = arr[i];
            
            if(split==0){
                answerArray[i] = null;
                // System.out.println(newLL); //remove
                // System.out.println(newLL.val); //remove
                // System.out.println(newLL.next); //remove

            }else{
               newLL = currentHead;
                split--;
                while(split!=0){
                    currentHead = currentHead.next;
                    split--;
                }
                ListNode temp = currentHead.next;
                currentHead.next = null;
                currentHead = temp;
                answerArray[i] = newLL;
                
            }
        }
        

        return answerArray;
    }
}
