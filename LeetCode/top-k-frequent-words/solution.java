class WordComparator implements Comparator<Map.Entry<String,Integer>>{
    public int compare(
        Map.Entry<String,Integer> a,
        Map.Entry<String,Integer> b
    ){

        if(a.getValue().equals(b.getValue())){

            return b.getKey().compareTo(a.getKey());
        }

        else{

            return a.getValue() - b.getValue();
        }

    }
}

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> freq = new HashMap<>();
        List<String> result = new ArrayList<String>();

        for(String word : words){
            freq.put(word , freq.getOrDefault(word , 0) + 1);
        }

        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(new WordComparator());

        for(Map.Entry<String,Integer> entry : freq.entrySet()){

            pq.offer(entry);

            if(pq.size() > k){
                pq.poll();
            }
        }

        while(!pq.isEmpty()){
            Map.Entry<String,Integer> entry = pq.poll();
            String key = entry.getKey();
            result.add(key);
        }

            Collections.reverse(result);

        return result;
    }
}