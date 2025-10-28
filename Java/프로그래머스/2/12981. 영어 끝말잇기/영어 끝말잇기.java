import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
    
        List<String> a = new ArrayList<>(); //이미 나온 단어 배열
        a.add(words[0]); // 첫번째 단어
        for(int i = 1; i < words.length; i++){
            if(a.contains(words[i])){ //ArrayList a에 i번째 단어가 있다면
                return new int[]{(i%n) + 1, (i/n) + 1};//해당 순번 사람의 몇번째 단어인지 리턴
            }
            else{
                a.add(words[i]); //아니라면 나온 단어 리스트에 저장
            }
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                return new int[]{(i%n) + 1, (i/n) + 1};
            }//만약 이전 단어의 끝글자와 첫번째 글자가 다르다면 해당 순번 사람과 그 사람의 몇번째 단어인지 리턴
        }
        return new int[]{0,0};
        //모두 다 통과 했다면 0,0 리턴
        
    }
}