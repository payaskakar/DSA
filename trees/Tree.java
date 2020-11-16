package trees;

import java.util.Scanner;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data=data;
    }
    public TreeNode(int data, TreeNode left, TreeNode right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
}
public class Tree {
    static Scanner sc=null;
    public static TreeNode createTree(){
        TreeNode root=null;
        System.out.println("Enter data for node");
        int data=sc.nextInt();
        if(data==-1)
            return null;
        root=new TreeNode(data);

        System.out.println("Enter left for:"+ data);
        root.left=createTree();
        System.out.println( "Enter right for:" + data);
        root.right=createTree();


        return root;
    }

    public static void main(String[] args) {
        sc=new Scanner(System.in);
        System.out.println("Enter the data for the tree");
        System.out.println(createTree());;

    }

}


