package problems;

import java.util.*;

public class p692 {

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String x : words) {
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        }

//
        PriorityQueue<String> heap = new PriorityQueue<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (hashMap.get(o1) == hashMap.get(o2)) {
                    return o1.compareTo(o2);
                }
                if (hashMap.get(o1) > hashMap.get(o2)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });


        for (String word: hashMap.keySet()) {
            heap.offer(word);
            if (heap.size() > k) heap.poll();
        }

        List<String> ans = new ArrayList<String>();
        while (!heap.isEmpty()) ans.add(heap.poll());
        Collections.reverse(ans);
        return ans;

    }

    public static void main(String[] args) {
        String[] words={"i", "love", "leetcode", "i", "love", "coding"};

        System.out.println(  new p692().topKFrequent(words,2).toString());


    }

}
