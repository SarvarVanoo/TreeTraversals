

public class InorderTraversal extends Node{
    Node root;

    public InorderTraversal()
    {
        root = null;
    }

    public void printInorder(Node node)
    {
        if(node == null)
        {
            return;
        }
        else
        {
            printInorder(node.left);
            System.out.print(node.data + " ");
            printInorder(node.right);
        }
    }

    public static void main(String[] args)
    {
        InorderTraversal tree = new InorderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder Traversal");

        tree.printInorder(tree.root);
    }
}

