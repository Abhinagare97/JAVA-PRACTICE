public class binarytreeg {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree {
        static int idx = -1;

        public static Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 3, -1, 4, 5, };
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(nodes);
        System.out.println(root.data);

    }

}
