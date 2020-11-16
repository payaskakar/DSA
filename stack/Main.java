package stack;

public class Main {
    public static void main(String[] args) {
        MyStack ob=new MyStack();
        ob.push(2);
        ob.push(3);
        ob.push(4);
        ob.print();
        System.out.println(ob.peek());
        System.out.println(ob.pop());
        System.out.println(ob.pop());
        System.out.println(ob.pop());
        System.out.println(ob.pop());
        System.out.println(ob.pop());


    }
}
