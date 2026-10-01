class DistanceCompare implements Comparator<Integer> {

    private int x;

    public DistanceCompare(int x) {
        this.x = x;
    }

    @Override
    public int compare(Integer a, Integer b) {

        int distanceA = Math.abs(a - x);
        int distanceB = Math.abs(b - x);

        if (distanceA == distanceB) {
            return b - a;
        }

        return distanceB - distanceA;
    }
}


class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new DistanceCompare(x));
        List<Integer> result = new ArrayList<>();

        for(int i : arr){
            pq.offer(i);

            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] res = new int[pq.size()];
        int index =0;
        while(!pq.isEmpty()){
            res[index] = pq.poll();
            index++;
        }

        Arrays.sort(res);

        for(int i : res){
            result.add(i);
        }


        return result;
    }
}