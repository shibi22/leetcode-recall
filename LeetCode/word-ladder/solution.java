class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Set<String> set = new HashSet<>(wordList);

        if(!set.contains(endWord)){
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int depth = 1;

        while(!queue.isEmpty()){


            int size = queue.size();

            while(size --> 0){
                String word = queue.poll();
                
                char[] ch = word.toCharArray();

                 for(int i = 0 ; i < ch.length; i++ ){
                    char original = ch[i];

                        for(char c = 'a'; c <= 'z'; c++){

                             if(c == original) continue;
                            ch[i] = c;

                            String next = new String(ch);

                            if(next.equals(endWord)) return depth +1;

                            if(set.contains(next)){
                                queue.offer(next);
                                 set.remove(next);
                             }

                        }

                        ch[i] = original;
                 }
            
            }

            depth++;

        }


        return 0;


    }
}