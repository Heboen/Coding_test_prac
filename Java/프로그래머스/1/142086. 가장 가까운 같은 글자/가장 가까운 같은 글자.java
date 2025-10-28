import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] idx = new int['z'-'a' + 1];//문자들 인덱스를 저장할 배열
        //문자들은 알바뱃 갯수만큼 존재하므로 z-a
        Arrays.fill(idx, -1);
        //초기의 문자들은 나온적이 없으므로 인덱스 -1로 초기화
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            //i번째 문자에서 a를 빼면 현재 위치의 알파뱃의 순서를 알 수 있으므로 어떤 문자가 나왔는지 알 수 있게됨
            answer[i] = idx[index] == -1 ? -1 : i-idx[index];
            //인덱스 배열에서 현재 나온 문자가 나온적이 없다면 -1을 나온적이 있다면 현재 위치에서 배열에서 해당 값을 불러와 빼면 몇번째 앞에 있는지 알 수 있게됨
            idx[index] = i;
            //인덱스 배열에서 가장 최근 위치로 초기화
        }
        return answer;
    }
}