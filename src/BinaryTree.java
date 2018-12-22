public class BinaryTree {
    BTNode root;

    public void insert(int x) {
        root = insertH(x, root);
    }

    //Left side takes precedence of insertions, so tree grows left
    public BTNode insertH(int x, BTNode temp) {
        if(temp == null) return new BTNode(x, null, null);

        if(temp.left == null) {
            temp.left = new BTNode(x, null, null);
            return temp;
        }

        if(temp.right == null) {
            temp.right = new BTNode(x, null, null);
            return temp;
        }

        temp.left = insertH(x, temp.left);
        return temp;
    }
}

class BTNode {
    int data;
    BTNode left;
    BTNode right;

    public BTNode(int x, BTNode l, BTNode r) {
        data = x;
        left = l;
        right = r;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }
}