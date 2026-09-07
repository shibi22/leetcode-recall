class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int nums1,nums2;

        for(String c : tokens){

            switch(c){
                case "+" -> stack.add(stack.pop() +  stack.pop());
                case "*" -> stack.add(stack.pop() * stack.pop());
                case "-" -> {
                    nums1 = stack.pop();
                    nums2 = stack.pop();

                    stack.add(nums2-nums1);
                }
                case "/" -> {
                    nums1 = stack.pop();
                    nums2 = stack.pop();

                    stack.add(nums2/nums1);
                }

                default -> stack.add(Integer.parseInt(c));
            }
        }


        return  stack.pop();
    }
}