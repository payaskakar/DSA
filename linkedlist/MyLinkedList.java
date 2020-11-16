package linkedlist;

public class MyLinkedList {

   public ListNode head;
   public boolean isEmpty()
    {
        if(head==null)
            return true;
        else
            return false;

    }
   public int remove()
    {
        return -1;
    }
   public void print()
    {
        ListNode tempp=head;
        while (tempp!=null)
        {
            System.out.print(tempp.data+"->");
            tempp=tempp.next;
        }
        System.out.println();
    }
   public void add(int x)
    {
        if(head==null)
        {
            head=new ListNode(x);
        }
        else
        {
            ListNode temp=head;
            while(temp.next !=null)
            {
                temp=temp.next;
            }
            ListNode y=new ListNode(x);
            temp.next=y;
        }
    }
}
