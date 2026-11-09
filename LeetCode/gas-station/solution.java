class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0 , costSum = 0;

        for(int i  = 0 ; i < gas.length; i++){
            gasSum+= gas[i];
            costSum+=cost[i];
        }

        if(gasSum < costSum) return -1;

        int totalGas = 0 , startingPoint = 0;

         for(int i  = 0 ; i < gas.length; i++){

            totalGas += gas[i] - cost[i];

            if(totalGas < 0){
                totalGas = 0;
                startingPoint = i +1;
            }
         }
        
    return startingPoint;

    }
}