package stack;

import linkedlist.ListNode;
import linkedlist.MyLinkedList;

public class MyStack {
    MyLinkedList list;

    public MyStack() {
        list = new MyLinkedList();
    }

    void push(int x) {
        list.add(x);

    }
    void print()
    {
        list.print();
    }
    int pop() {
        ListNode temp = list.head;
        if (temp == null) {
            return -1;
        }
        if (temp.getNext() == null) {
            list.head=null;
            int i=temp.getData();
            return i;
        }
        while (temp.getNext().getNext()!=null)
        {
            temp=temp.getNext();
        }
        int c=temp.getNext().getData();
        temp.setNext(null);
        return c;
    }

    int peek() {
        ListNode temp = list.head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp.getData();
    }
}
