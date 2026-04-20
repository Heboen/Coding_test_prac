import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0; 
        Map<Integer, Integer> map = new HashMap<>();
        //귤 크기별 수확량 저장할 해시맵
        
        for (int i : tangerine){
            map.put(i, map.getOrDefault(i,0) + 1);
            //map에 귤 크기별 갯수 저장
            //map에 귤이 없다면 0을 있다면 해당 귤의 갯수를 불러와 +1
        }
        
        List<Integer> keyList = new ArrayList<>(map.keySet());
        //키값만 리스트 불러옴
        
        keyList.sort(((o1,o2) -> map.get(o2) - map.get(o1)));
        //keyList를 귤 갯수에 따라 내림차순 정렬
        
        for (int i : keyList){
            if(k<=0){//귤을 다 골랐다면 탈출
                break;
            }
            answer++;
            k-=map.get(i);
        }
        return answer;
    }
}
