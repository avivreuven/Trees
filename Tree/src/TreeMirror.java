public class TreeMirror {

    public static TreeNode treeMirror (TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode node = new TreeNode(null,null, root.getData());
        node.setLeft(treeMirror(root.getRight()));
        node.setRight(treeMirror(root.getLeft()));
        return node;
    }

    public static void main(String []arg){
        TreeNode node4 = new TreeNode(null,null,4);
        TreeNode node5 = new TreeNode(null,null,5);
        TreeNode node6 = new TreeNode(null,null,6);
        TreeNode node7 = new TreeNode(null,null,7);
        TreeNode node2 = new TreeNode(node4,node5,2);
        TreeNode node3 = new TreeNode(node6,node7,3);
        TreeNode node1 = new TreeNode(node2,node3,1);
        node1.inOrderPrint();
        TreeNode mirror = treeMirror(node1);
        mirror.inOrderPrint();
    }
}
