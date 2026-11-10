class Solution {
    public String largestNumber(int[] nums) {
        
        String[] numsArray = new String[nums.length];

        for(int i = 0 ; i < nums.length; i++){
            numsArray[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numsArray , (a,b) ->{

           return (b + a).compareTo(a + b);
        });

        if(numsArray[0].equals("0")){
                return "0";
            }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numsArray.length; i++){
            sb.append(numsArray[i]);
        }


        return sb.toString().equals("00") ? "0" : sb.toString();
    }
}