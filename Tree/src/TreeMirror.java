public class TreeMirror {
    public TreeNode treeMirror (TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode node = new TreeNode(null,null, root.getData());
        node.setLeft(treeMirror(root.getRight()));
        node.setRight(treeMirror(root.getLeft()));
        return node;
    }
}
