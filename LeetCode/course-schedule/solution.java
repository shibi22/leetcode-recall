class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        

        ArrayList<List<Integer>> adj = new  ArrayList<List<Integer>>();
        int[] inDegree = new int[numCourses];

        for(int i = 0; i < numCourses; i++){
           adj.add(new ArrayList<>());
        }

            
         
            for(int[] prerequisite : prerequisites){
                int course = prerequisite[0];
                int pre = prerequisite[1];

               adj.get(pre).add(course);
                inDegree[course]++;

            }
         


        Queue<Integer> queue = new LinkedList<>();
     

        for(int i = 0; i < numCourses; i++){
           
            if(inDegree[i] ==  0){
                queue.offer(i);
            }
        }


        int processedCources = 0;

        while(!queue.isEmpty()){
            int node = queue.poll();
            processedCources++;

            for(int neighbor : adj.get(node)){
                inDegree[neighbor]--;

                if(inDegree[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
        }

      return  processedCources == numCourses;
        
    }
}