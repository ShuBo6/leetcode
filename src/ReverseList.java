//public class ReverseList {
//
//    static class ListNode{
//        int value;
//        ListNode next;
//
//        public ListNode(int value, ListNode next) {
//            this.value = value;
//            this.next = next;
//        }
//    }
//    public static ListNode Iterate(ListNode head){
//        ListNode prev,next,curr;
//        curr=head;
//        while (curr!=null){
//            prev=curr;
//            next=curr.next;
//            curr.next=prev;
//
//            curr=next;
//        }
//
//        return prev;
//
//    }
//    public static void main(String[] args) {
//
//    }
//}
