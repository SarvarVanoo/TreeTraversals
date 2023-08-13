
public class PreorderTraversal extends Node{
    Node root;

    public PreorderTraversal()
    {
        root = null;
    }

    void printPreorder(Node node)
    {
        if (node == null)
        {
            return;
        }
        else
        {
            System.out.print(node.data + " ");

            printPreorder(node.left);

            printPreorder(node.right);
        }
    }

    public static void main(String[] args)
    {
        PreorderTraversal tree = new PreorderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder Traversal");
        tree.printPreorder(tree.root);
    }
}
