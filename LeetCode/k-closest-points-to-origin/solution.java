class Point {
    int a , b ,distance;

     Point(int a , int b){
        this.a = a;
        this.b = b;
        distance = a * a + b * b;
    }
}


class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>( (a,b) -> Integer.compare(b.distance , a.distance));

        for(int[] i : points){
            Point p = new Point(i[0],i[1]);

            pq.offer(p);

            if(pq.size()>k){
                pq.poll();
            }
        }

        int[][] result = new int[k][2];
        int index = 0;
        while(!pq.isEmpty()){
            Point p = pq.poll();
            result[index][0] = p.a;
            result[index][1] = p.b;
            index++;

        }

        return result;
    }
}