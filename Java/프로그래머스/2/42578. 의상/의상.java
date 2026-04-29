import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> clothMap = new HashMap<>();
        
        //각 의상 종류별 개수 누적
        for (String[] cloth : clothes){
            clothMap.merge(cloth[1], 1, Integer::sum);
        }
        int answer = 1;
        
        //각 종류마다 (선택 + 미선택) 경우의 수 곱셈
        for(int kinds : clothMap.values()){
            answer *= kinds + 1;
        }
        
        // 아무것도 입지 않는 경우 제외
        return answer-1;
    }
}