import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap <String, Integer> hmap = new HashMap<>();
        int answer = 0;
        for(int i = 0; i<want.length; i++){
            hmap.put(want[i], number[i]);
        }
        for(int i = 0; i <= discount.length - 10; i++){
            HashMap<String, Integer> map = new HashMap<>();
            
            for(int j = i; j < i+10; j++){
                map.put(discount[j], map.getOrDefault(discount[j], 0)+1);
            }
            
            boolean isMatch = true;
            for(String item : hmap.keySet()){
                if(map.getOrDefault(item,0) != hmap.get(item)){
                    isMatch = false;
                    break;
                }
            }
            if(isMatch){
                answer++;
            }
        }
        
        return answer;
    }
}