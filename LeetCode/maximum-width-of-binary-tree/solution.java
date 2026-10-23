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
    public int widthOfBinaryTree(TreeNode root) {
        int max = 0;
        if (root == null) return max;
        Queue<Pair<TreeNode , Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root,0));

        while(!queue.isEmpty()){
            int size = queue.size();
            TreeNode nodeValue = queue.peek().getKey();
            int firstIndex = queue.peek().getValue();
            int lastIndex = 0;

            for(int i = 0 ; i < size; i++){
                Pair<TreeNode, Integer> pair = queue.poll();
                TreeNode node = pair.getKey();
                lastIndex = pair.getValue();
                int index = pair.getValue();

                if(node.left != null) queue.offer(new Pair<>(node.left , 2 * index));
                if(node.right != null) queue.offer(new Pair<>(node.right , 2 * index +1));
            }

            int currentMax = lastIndex - firstIndex + 1;
            max = Math.max(max , currentMax);
        }



        return max;
    }
}