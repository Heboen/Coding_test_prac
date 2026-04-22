import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer,Integer> cake1 = new HashMap<>();
        Map<Integer,Integer> cake2 = new HashMap<>();
        //토핑을 나누어가질 케이크들
        
        for(int i = 0; i < topping.length; i++){
            int topp = topping[i];
            cake2.put(topp, cake2.getOrDefault(topp, 0) + 1);
            //먼저 케이크 한쪽에 모든 토핑을 다 옮겨둔뒤
        }
        for(int i = 0; i < topping.length; i++){
            int topp = topping[i];
            cake1.put(topp, cake1.getOrDefault(topp,0) + 1);
            //다른 케이크에 하나씩 옮겨감
            
            if(cake2.containsKey(topp)){
                if(cake2.get(topp) == 1){
                    cake2.remove(topp);
                }
                else cake2.put(topp, cake2.getOrDefault(topp,0)-1);
                //케이크의 토핑을 옮겨 갔으니 원래 있던 자리에서 하나씩 없엠
            }
            if(cake1.keySet().size() == cake2.keySet().size()){
                //만약 토핑의 가짓수가 양쪽 똑같다면
                answer++; //경우의 수 +1
            }
        }
        
        
        return answer;
    }
}