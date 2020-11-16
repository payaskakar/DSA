package queue;

import linkedlist.ListNode;
import linkedlist.MyLinkedList;

public class MyQueue {
   //final int length=10;
    MyLinkedList queue;
    //MyQueue queuee;
        MyQueue() {
            queue=new MyLinkedList();
      //      queuee=new MyQueue();
        }
    int peek(){
        ListNode temp=queue.head;
        if(temp==null)
            return -1;
        if (temp.getPrev()==null)
            return temp.getData();
        else{
            while (temp.getNext()!=null)
            {
                temp=temp.getNext();
            }
            return temp.getData();
        }
    }

    int poll(){
            ListNode temp=queue.head;
            int res=0;
            if(temp.getNext()==null)
                return temp.getNext().getData();
            if(temp==null) {
                return -1;
            }
            else {
                while (temp.getNext()!=null) {
                    temp=temp.getNext();
                }
                if(temp.getPrev()==null) {
                    res=queue.head.getData();
                    temp.getNext().setPrev(null);
                }
                return res;
            }
    }

//    public int size(){
//        ListNode temp=queue.head;
//        int size=0;
//        if(queue.head.getNext()==null)
//            return 1;
//        if(queue.head==null)
//            return size;
//        else
//            while(temp.getNext()!=null){
//                temp=temp.getNext();
//                size++;
//            }
//        return size;
//    }

    void element(int x){
        queue.add(x);
//        if(queuee.size()>=length)
//            return true;
//        else
//            return false;

    }

    boolean isEmpty(){
        if(queue.isEmpty())
            return true;
        else
            return false;
    }



    void print(){
        queue.print();
    }
}
