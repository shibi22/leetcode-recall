class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<int[]> result = new ArrayList<>();

        if(intervals.length == 0) return intervals;

        Arrays.sort(intervals , (a,b) -> {
            return Integer.compare(a[0], b[0]);
        });

     int start = intervals[0][0];
     int end   =  intervals[0][1];

       for(int i =1; i < intervals.length; i++){
            int[] current = intervals[i];

            if(current[0] <= end){
                end = Math.max(end, current[1]);
            }
            else{
                result.add(new int[] {start,end});
                start =  current[0];
                end = current[1];
            }
       }

       result.add(new int[] {start ,end});


       return result.toArray(new int[result.size()][]);

    }
}