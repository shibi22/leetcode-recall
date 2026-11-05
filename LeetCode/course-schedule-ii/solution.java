class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int[] result = new int[numCourses];
        int[] inDegree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();


        ArrayList<ArrayList<Integer>> adj = new   ArrayList<ArrayList<Integer>>();


        for(int i = 0 ; i < numCourses; i ++ ){
            adj.add(new ArrayList<Integer>());
        }

            for(int[] prerequisite : prerequisites){
                int course = prerequisite[0];
                int pre =   prerequisite[1];

                adj.get(pre).add(course);
                inDegree[course]++;
            }


        for(int i  = 0 ; i < numCourses ; i++){

            if(inDegree[i] ==  0){
                queue.offer(i);
            }
        }

        int count = 0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            result[count++] = node;

            for(int neibour : adj.get(node)){
                inDegree[neibour]--;

                if(inDegree[neibour] == 0){
                    queue.offer(neibour);
                }

            }
        }




        return numCourses == count ? result : new int[0] ;
    }
}