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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        int direction = 0;

        if(root == null) return result;

        queue.offer(root);

        while(!queue.isEmpty()){
            
            List<Integer> subResult = new ArrayList<>();
            int size = queue.size();

            for(int i =0 ; i < size; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subResult.add(queue.poll().val);
            }

            if(direction == 0){
                result.add(subResult);
                direction = 1;
            }

            else{
                List<Integer> reversed = new ArrayList<>();
               for(int i =subResult.size() -1 ; i >=0; i--){
                    reversed.add(subResult.get(i));
               }
               result.add(reversed);
               direction = 0;
            }
        }

        return result;
    }
}