import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List <Integer> date = new ArrayList<>(); //결과를 저장할 date리스트
        Queue <Integer> duedate = new LinkedList<>(); //작업 소요 시간을 저장할 큐
        for(int i = 0; i < progresses.length; i++){
            duedate.add((100 - progresses[i] + speeds[i] - 1) / speeds[i]);
            //큐에 작업별 소요 시간 저장
        }
        int day = 1; //한번에 완료될 작업의 수
        int first = duedate.poll();//가장 처음 작업을 불러옴
        while(!duedate.isEmpty()){//큐가 다 빌때 까지 반복
            if(!duedate.isEmpty() && first >= duedate.element()){
                //큐가 비어있지 않고 첫번째 작업소요시간이 두번째 보다 길다면
                day += 1;//작업 수 추가
                duedate.remove();//큐에서 작업 제외
            }
            else{//소요 시간이 더 긴 작업이 나왔을 경우
                date.add(day); //작업 수 date 큐에 추가
                first = duedate.poll();
                day = 1;//작업 수 초기화
            }  
        }
        date.add(day);
        
        int[] answer = new int[date.size()];
        for (int j = 0; j < date.size(); j++){
            answer[j] = date.get(j);
        }
        //date 리스트 answer 배열에 값 저장
        return answer;
    }
}