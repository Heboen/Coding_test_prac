import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> hmap = new HashSet<>();
        for(int i = 0; i<elements.length; i++){
            int s = 0;//합 저장
            for(int j = 0; j<elements.length; j++){
                //길이가 1인 연속부분부터 5인 연속부분 합 반복
                s += elements[(i+j)%elements.length];
                hmap.add(s);//매번 합할때마다 set에 저장 
            }
        }
        answer = hmap.size();
        return answer;
    }
}