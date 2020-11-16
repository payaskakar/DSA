package linkedlist;

public class ListNode {

    int data;
    ListNode next;
    ListNode prev;
    ListNode(int x){
        data=x;
        next =null;
        prev=null;
    }

    public int getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
    public ListNode getPrev()
    {
        return prev;
    }
    public void setPrev(ListNode prev)
    {
        this.prev=prev;
    }


}
