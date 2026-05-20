import java.util.*;

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] answer = new int[A.length];
        for(int i = 1; i <= A.length; i++){
            HashMap<Integer, Integer> hmap = new HashMap<>(i);
            // PriorityQueue<Integer> qa = new PriorityQueue<>();
            // PriorityQueue<Integer> qb = new PriorityQueue<>();
            // for(int j = 0; j < i; j++){
            //     qa.add(A[j]);
            //     qb.add(B[j]);
            // }

            for(int j = 0; j < i; j++){
                hmap.put(A[j], hmap.getOrDefault(A[j], 0)+1);
                hmap.put(B[j], hmap.getOrDefault(B[j], 0)+1);
            }
            int cnt = 0;
            for(int key : hmap.keySet()){
                if(hmap.get(key) > 1){
                    cnt++;
                }
            }
            answer[i-1] = cnt;
        }
        return answer;
    }
}