class Solution {
    public String addStrings(String num1, String num2) {

        int i = num1.length()-1;
        int j = num2.length()-1;

        StringBuilder  result = new StringBuilder();

        int carry = 0;

        while(i >=0 || j >=0 || carry > 0){

            int DigitOne = 0;
            int DigitTwo = 0;

            if(i >= 0){
                DigitOne = num1.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                DigitTwo = num2.charAt(j) - '0';
                j--;
            }

            int sum = DigitOne + DigitTwo + carry;

            result.append(sum%10);

            carry = sum / 10;
        }

        return result.reverse().toString();
    }
}