import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        long answer = 0;
        for(int i : works){
            que.add(i);
        }
        for(int i = 0; i<n && !que.isEmpty();i++){
            int work = que.poll()-1;
            if(work>0) que.add(work);
        }
        while(que.size() != 0){
            int a = que.poll();
            answer += a*a;
        }
        return answer;
    }
}