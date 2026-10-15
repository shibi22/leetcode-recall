/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

        int preorderIndex = 0;
        Map<Integer,Integer> inorderMap = new HashMap<>();


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        



        for(int i =0; i < inorder.length; i++){
            inorderMap.put(inorder[i] , i);
        }


        return build(preorder , 0 , inorder.length -1);
    }

     public TreeNode build(int[] preorder , int left , int right){

        if(left > right) return null;

        int rootElement = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootElement);
        int inorderLength = inorderMap.get(rootElement);

        root.left = build(preorder , left , inorderLength -1);
        root.right = build(preorder , inorderLength + 1 , right );


        return root;
     }
}