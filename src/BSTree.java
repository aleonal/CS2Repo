public class BSTree {
    BTNode root;

    public void insert(int x) {
        root = insertH(x, root);
    }


    public BTNode insertH(int x, BTNode temp) {
        if(temp == null) {
            return new BTNode(x, null, null);
        }

        if(x < temp.data) {
            temp.left = insertH(x, temp.left);
        } else if(x > temp.data) {
            temp.right = insertH(x, temp.right);
        }

        return temp;
    }
}
