public class TestTree {
    public static void main(String[] args)  {
        
        Tree myTree = new Tree();
        Node nodeA = new Node('A');
        Node nodeB = new Node('B');
        Node nodeC = new Node('C');
        Node nodeD = new Node('D');
        Node nodeE = new Node('E');
        Node nodeF = new Node('F');
        Node nodeG = new Node('G');
        Node nodeH = new Node('H');
        Node nodeI = new Node('I');

        myTree.root = nodeF;
        nodeF.left = nodeB;
        nodeF.right = nodeG;

        nodeB.left = nodeA;
        nodeB.right = nodeD;

        nodeD.left = nodeC;
        nodeD.right = nodeE;

        nodeG.right = nodeI;
        nodeI.left = nodeH;

        System.out.println("Breadth First: ");
        myTree.breadth();
       
        System.out.println("\n\nDepth First: ");
        System.out.println("\nIn Order ");
        myTree.in0rder(nodeF);
        
        System.out.println("\nPost Order ");
        myTree.post0rder(nodeF);

        System.out.println("\nPre Order ");
        myTree.pre0rder(nodeF);
    }      
}
