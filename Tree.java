import java.util.LinkedList;
import java.util.Queue;

public class Tree{
    Node root;

    public Tree(){
        this.root = null;
    }
    public Tree(int rootValue){
        this.root = new Node(rootValue);
    }

private void visit(Node p){
    System.out.print((char)p.value);
}
    public void breadth()
    {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root); // enqueue => day vao

        Node p;
        while(!queue.isEmpty())
        {
            //dequeue => day ra khoi queue
            p = (Node)queue.poll();
            if(p.left!=null)
                queue.add(p.left);
            if(p.right!=null)
                queue.add(p.right);

            visit(p);
        }
        
    }
    void pre0rder(Node p) //VLR
    {
        if(p==null) return;
        visit(p);
        pre0rder(p.left);
        pre0rder(p.right);
    }
    void in0rder(Node p) //LVR
    {
        if(p==null) return;
        in0rder(p.left);
        visit(p);
        in0rder(p.right); 
    }    
    void post0rder(Node p) //LRV
    {
        if(p==null) return;
        post0rder(p.left);
        post0rder(p.right);
        visit(p);
    }  
}
