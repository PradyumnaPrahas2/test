package dsa_java;
import java.util.*;
public class NaryTree {
    public NaryTreeNode root;
    NaryTree(int node){
        root=new NaryTreeNode(node);
    }

    public void addChild(NaryTreeNode parent,int child_val){
        if(parent!=null){
            NaryTreeNode child=new NaryTreeNode(child_val);
            parent.children.add(child);
        }
    }
    public void preorder(NaryTreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.val+" -> ");
        for(NaryTreeNode child:node.children){
            preorder(child);
        }
    }
    public void inorder(NaryTreeNode node){
        if(node==null){
            return;
        }
        int N=node.children.size();

        for(int i=0;i<N/2;i++){
            inorder(node.children.get(i));
        }
        System.out.print(node.val+" -> ");
        for(int i=N/2;i<N;i++){
            inorder(node.children.get(i));
        }
    }
    public void postorder(NaryTreeNode node){
        if(node==null) return;
        for(NaryTreeNode child:node.children){
            postorder(child);
        }
        System.out.print(node.val+" -> ");
    }
    public void levelOrder(NaryTreeNode root){
        Queue<NaryTreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            NaryTreeNode top=q.poll();
            System.out.print(top.val+" -> ");
            for(NaryTreeNode child:top.children){
                q.add(child);
            }
        }
    }
    public static void main(String[] args){
        NaryTree tree = new NaryTree(1);
        tree.addChild(tree.root, 2);
        tree.addChild(tree.root, 3);
        tree.addChild(tree.root, 4);

        NaryTreeNode node2 = tree.root.children.get(0); 
        tree.addChild(node2, 5);
        tree.addChild(node2, 6);

        NaryTreeNode node3 = tree.root.children.get(1); 
        tree.addChild(node3, 7);

        System.out.println("Preorder traversal:");
        tree.preorder(tree.root); 

        System.out.println("\nPostorder traversal");
        tree.postorder(tree.root);

        System.out.println("\nInorder traversal");
        tree.inorder(tree.root);
        
        System.out.println("\n Level Order traversal:");
        tree.levelOrder(tree.root);
    }
}
class NaryTreeNode{
    public int val;
    public List<NaryTreeNode> children;
    NaryTreeNode(int node){
        this.val=node;
        this.children=new ArrayList<>();
    }
}