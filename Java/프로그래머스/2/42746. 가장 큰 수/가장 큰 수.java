import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strnum = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            strnum[i] = String.valueOf(numbers[i]);
        }//배열에 숫자들을 문자열로 변환하여 저장
        Arrays.sort(strnum, (a,b) -> (b+a).compareTo(a+b));
        //문자들을 2개씩 조합하여 더 큰 수가 앞으로 오도록 정렬
        //ex) -> 2 + 20 VS 20 + 2 의 경우 2가 앞에 있을때가 더 큰 숫자 이므로 2 , 20 순으로 정렬
        if(strnum[0].equals("0")) return "0";
        //첫자리가 0이라면 배열은 0으로 이루어져 있으므로 0 리턴
        StringBuilder answer = new StringBuilder();
        for(String str : strnum){
            answer.append(str);
        }
        //숫자는 정렬되어 있으므로 차례대로 이어 붙임
        return answer.toString();
    }
}