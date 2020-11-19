package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {

    public static void bfs(ListNode node)
    {
        List<Integer> set=new ArrayList<>();
        Queue<ListNode>queue=new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            ListNode root=queue.poll();
            set.add(root.data);
            if(node.left!=null)
                queue.add(root.left);
            if(node.right!=null)
                queue.add(root.right);


        }
        System.out.println(set);

    }
}
