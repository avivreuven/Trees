public class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private int data;

    public TreeNode(TreeNode left, TreeNode right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void inOrderPrint() {
        if (left != null){
            left.inOrderPrint();
        }
        System.out.print(data);
        if (right != null){
            right.inOrderPrint();
        }
    }
    public void preOrderPrint() {
        System.out.print(data);
        if (left != null){
            left.inOrderPrint();
        }
        if (right != null){
            right.inOrderPrint();
        }
    }
    public void postOrderPrint() {
        if (left != null){
            left.inOrderPrint();
        }
        if (right != null){
            right.inOrderPrint();
        }
        System.out.print(data);
    }
}
