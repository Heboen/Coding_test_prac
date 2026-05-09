import java.util.*;
class Solution {
    public int solution(int N, int number) {
        List<Set<Integer>> dp = new ArrayList<>();//연속된 숫자(Ex:55, 555) 와 같은 숫자 저장을 위한 해시 셋 리스트
        for(int i = 0; i<= 8; i++){
            dp.add(new HashSet<>());
        }
        int tempN = 0;
        for(int i = 1; i <= 8; i++){
            tempN = tempN * 10 +N;
            dp.get(i).add(tempN);
            //연속된 숫자 저장
        }
        for(int i = 1; i <= 8; i++){
            for(int j = 1; j < i; j++){
                for(int a : dp.get(j)){
                    for(int b : dp.get(i-j)){
                        dp.get(i).add(a+b);//a+b 연산 저장
                        dp.get(i).add(a-b);//a-b 연산 저장
                        dp.get(i).add(a*b);//a*b 연산 저장
                        if(b!= 0) dp.get(i).add(a/b); //0이 아니라면 a/b 연산 저장
                    }
                }
            }
            if(dp.get(i).contains(number)){//만약 리스트에 number가 있다면 해당 횟수가 최소값이므로 반환
                return i;
            }
    }
            return -1;//숫자가 없다는것은 8회 이상라는 의미이므로 -1 리턴
        }
    }
