package DSA.String.medium;
import java.util.*;

public class CharFrequency {
        public String frequencySort(String s) {
            HashMap<Character,Integer> mpp= new HashMap<>();
            for(char c: s.toCharArray()){
                mpp.put(c,mpp.getOrDefault(c,0)+1);
            }

            PriorityQueue<Map.Entry<Character,Integer>> pq= new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

            pq.addAll(mpp.entrySet());

            StringBuilder ans = new StringBuilder();

            while(!pq.isEmpty()){
                Map.Entry<Character,Integer> entry = pq.poll();
                char ch = entry.getKey();
                int fq= entry.getValue();

                for(int i=0; i<fq ;i++){
                    ans.append(ch);
                }
            }

            return ans.toString();
        }
    }

