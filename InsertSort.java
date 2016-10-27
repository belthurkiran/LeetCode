public class InsertSort {
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode cur = head;
        ListNode first=head;
        ListNode prev = null;
        while(cur.next!=null){
            if(cur.next.val<cur.val){
                ListNode temp=cur.next;
                cur.next = cur.next.next;
                first = head;
                prev=null;
                while(first.val<temp.val){
                    prev = first;
                    first=first.next;
                }
                if(prev==null){
                    temp.next=head;
                    head=temp;
                }
                else{
                prev.next = temp;
                temp.next=first;
                }
                cur=head;
            }
            cur=cur.next;
        }
        return head;
    }
}
