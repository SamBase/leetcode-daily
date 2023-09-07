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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode ph=null,ch=head;
        ListNode leftJoin=null;
        ListNode rightJoin=null;
        ListNode tempHead=null;
        // ListNode[] arr = new ListNode[5];//remove
        int node = 1;
        
        // print(head);//remove
        if(head.next==null){return head;}
        
        while(node!=left){
            ph = ch;
            ch = ch.next;
            node++;
            // System.out.println(ch);//remove
        }
        
        // arr[0]=ph;//remove
        // arr[1]=ch;//remove
        // System.out.println(Arrays.toString(arr));//remove
        
        leftJoin = ph;
        if(leftJoin!=null){leftJoin.next = null;}
        tempHead=ch;
        
        // print(head);//remove
        // print(ph);//remove
        // System.out.println("leftJoin=");//remove
        // System.out.println("leftJoin="+leftJoin);//remove
        // System.out.println("leftJoin=");//remove

        
        while(node!=right){
            ph=ch;
            ch=ch.next;
            node++;
        }
        rightJoin=ch.next;
        ch.next=null;

        // System.out.println("rightJoin="+rightJoin);//remove
        
        tempHead = reverseLinkedList(tempHead);
        
        // print(tempHead);//remove
        
        if(leftJoin!=null){leftJoin.next = tempHead;}
        ch = tempHead;
        
        // print(head);//remove
        
        while(ch.next!=null){
            ch=ch.next;
        }
        
        ch.next=rightJoin;
        
        if(leftJoin==null)return tempHead;
        return head;
    }
    
    public ListNode reverseLinkedList(ListNode head){
        ListNode ph=null,ch=head;
        
        if(head.next==null)return head;
        
        while(ch!=null){
            ListNode temp = ch.next;
            ch.next = ph;
            
            if(head==ph)ph.next = null;
            
            ph=ch;
            ch=temp;
        }
        head=ph;
        
        return head;
    }
    
    // public void print(ListNode head){
    //     ListNode m=head;
    //     while(m!=null){
    //         System.out.print(m+"->"+m.next+"\t");
    //         m=m.next;
    //     }
    //     System.out.println("\n-------------------------------------");//remove
    // }
}
