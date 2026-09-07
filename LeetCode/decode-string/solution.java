class Solution {
    public String decodeString(String s) {

        Stack<String> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            if(ch != ']'){
                stack.push(String.valueOf(ch));
            }

            else{
                StringBuilder temp = new StringBuilder();

                  while(!stack.peek().equals("[")){
                            temp.insert(0,stack.pop());
                  }
                  stack.pop(); // to remove the '['
                    
                StringBuilder num = new StringBuilder();

                  while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){

                        num.insert(0,stack.pop());
                  }


                  String decoded = temp.toString().repeat(Integer.parseInt(num.toString()));
                  stack.push(decoded);
                  
            }

        }

        StringBuilder result = new StringBuilder();   
        while(!stack.isEmpty()){
           result.insert(0, stack.pop());
        }

        return result.toString();
    }
}