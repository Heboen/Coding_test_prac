import java.util.*;

class Solution {
    public int[] solution(String s) {
        String target = s; //0을 제거 해야할 문자열
        String in_to = ""; //0을 제거한 문자열
        int zero_count = 0; //제거한 0의 갯수
        int count = 0; //회차 카운트
        while(true){
            if (target.equals("1")){ //문자열이 1이라면 
                break; //반복문 중단
            }
                in_to = target.replace("0",""); // 문자열에서 0을 제거하여 저장
                zero_count += (target.length() - in_to.length()); // 문자열 길이를 비교하여 제거한 0의 갯수 카운트
                count+=1; // 회차 + 1
                target = Integer.toBinaryString(in_to.length()); // 타겟 문자열을 제거한 문자열의 길이로 이진변환
        }
        int[] answer = {count,zero_count};
        return answer;
    }
}