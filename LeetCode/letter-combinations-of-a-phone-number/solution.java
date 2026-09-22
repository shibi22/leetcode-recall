class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0) return result;

        String[] map ={"", "",  "abc", "def" , "ghi", "jkl", "mno","pqrs","tuv","wxyz"};
        generate(digits,"" ,map ,result);
        return result;
    }

    private void generate(String digits , String current , String[] map ,  List<String> result){
        if(digits.length() == current.length()){
            result.add(current);
            return;
        }
    int pos = current.length();
    char digitChar = digits.charAt(pos);
    int digit = digitChar - '0';
    String letters = map[digit];

    for(char c : letters.toCharArray()){
        generate(digits, current + c ,map ,result);
    }

    }
}