import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch extends Node{

    Node root;

    public void printBFS()
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            if(tempNode.left != null)
            {
                queue.add(tempNode.left);
            }

            if(tempNode.right != null)
            {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args)
    {
        BreadthFirstSearch tree = new BreadthFirstSearch();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Breadth First Search");

        tree.printBFS();
    }
}
