import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people); //몸무게 오름차순 정렬
        int left = 0, right = people.length - 1; //양끝 인덱스
        while(left <= right){ // 왼쪽 인덱스가 오른쪽 인덱스보다 작을때 동안 반복
            if(people[right--] + people[left] <= limit) left++; 
            //가장 무거운 사람과 가장 가벼운 사람이 함께 보트를 이용할 수 있는 경우
            
            answer++;//보트 하나 사용
        }
        return answer;
    }
}