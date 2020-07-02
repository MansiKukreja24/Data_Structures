package Tree.BinarySearchTree;

public class Tree {
    private TreeNode root;
     public void insert(int value){
         if(root == null)
             root = new TreeNode(value);
         else
             root.insert(value);

         }

    public TreeNode get(int value){
        if(root!=null) {
            return root.get(value);
        }
        return null;
    }

    public int min(){
         if(root == null)
             return Integer.MIN_VALUE;
         else
             return root.min();
    }

    public int max(){
         if(root == null)
             return Integer.MAX_VALUE;
         else
             return root.max();

    }
    // Delete method if a node has either 0 or 1 child.

    public void delete(int value){
         root = delete(root,value);
    }
    public TreeNode delete(TreeNode subTreeRoot, int value){
         if(subTreeRoot == null)
             return subTreeRoot;
         if(value < subTreeRoot.getData()){
             subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(),value));
         }
         else if(value > subTreeRoot.getData()){
             subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(),value));
         }
         else{
             if(subTreeRoot.getLeftChild() == null)
                 return subTreeRoot.getLeftChild();
             else if(subTreeRoot.getRightChild()==null)
                 return subTreeRoot.getRightChild();
         }

         // node has 2 children.

        //Replace the value in the subtreenode with the smallest value
        // from the right subtree
        subTreeRoot.setData(subTreeRoot.getRightChild().min());

        // Delete the node that has smallest value in right subtree.

         subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(),subTreeRoot.getData()));


         return subTreeRoot;
    }







         public void traverseInOrder(){
            if(root!=null)
                root.traverseInOrder();
         }


     }

