public class PostorderTraversal extends Node{

    Node root;

    public PostorderTraversal()
    {
        root = null;
    }

    public void printPostorder(Node node)
    {
        if(node == null)
        {
            return;
        }
        else
        {
            printPostorder(node.left);
            printPostorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args)
    {
        PostorderTraversal tree = new PostorderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Postorder Traversal");
        tree.printPostorder(tree.root);
    }
}
