package binarytree;

import java.util.Scanner;

import static binarytree.Bfs.bfs;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ListNode node=createTree();
      System.out.println(bfs(roo));
    }



    static ListNode createTree(){
        ListNode node=null;
        System.out.print("Enter data:");
        int data=sc.nextInt();
        if(data==-1)
            return null;
        node=new ListNode(data);
        System.out.print("left"+data);
        node.left=createTree();
        System.out.print("right"+data);
        node.right=createTree();

    return node;
    }
}
