import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        //최대 최소 저장할 우선순위 큐
        PriorityQueue<Integer> minq = new PriorityQueue<>();
        PriorityQueue<Integer> maxq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Integer>map = new HashMap<>();

        for(String i : operations){
            String[] cmd = i.split(" ");
            String c = cmd[0];
            int num = Integer.parseInt(cmd[1]);
            switch(c){
                    case "I": { //큐에 값 삽입
                        minq.offer(num);
                        maxq.offer(num);
                        map.put(num, num);
                        break;
                    }
                    case "D": {
                        PriorityQueue<Integer> now;
                        if(num == -1){ //최소값 기준
                            now = minq;
                            
                        }
                        else{//최대값 기준
                            now = maxq;
                            
                        }
                        while(now.size()>0){//큐에서 값 삭제
                            int n = now.poll();
                            if(map.get(n) != null){
                                map.remove(n);
                                break;
                            }
                        }
                        break;
                    }
            }
        }
        while(maxq.size()>0){
            int peek = maxq.peek();
            if(map.get(peek) == null) maxq.poll();
            else break;
        }
        while(minq.size()>0){
            int peek = minq.peek();
            if(map.get(peek) == null) minq.poll();
            else break;
        }
        
        if(maxq.size() == 0 && minq.size() == 0){ return new int[]{0,0};}
        else{
            return new int []{maxq.peek(), minq.peek()};
        }    
    }
}   