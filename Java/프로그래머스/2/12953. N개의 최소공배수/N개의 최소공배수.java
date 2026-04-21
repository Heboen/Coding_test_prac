class Solution {
    public int solution(int[] arr) {
        int lcm = 0; //최소 공배수
        int gcd = 0; //최대 공약수
        
        gcd = get_gcd(arr[0], arr[1]); //첫번째와 두번째 수의 최대 공약수 구하기
        lcm = (arr[0]*arr[1]) / gcd; // 첫번째와 두번째 수의 최소 공배수 구하기
        //첫번째와 두번째 숫자로 최소공배수를 구했으므로
        for(int i = 2; i < arr.length; i++){//세번째 숫자부터 반복문으로
            gcd = get_gcd(lcm, arr[i]);
            lcm = (lcm*arr[i]) /gcd;
            //이전에 구했던 lcm과 다음 순번 숫자간의 최대 공약수와 최소 공배수 계산
        }
        
        return lcm;//반복문을 탈출했다면 최종 lcm 리턴
    }
    public int get_gcd(int num1, int num2){ // 최대 공약수 구하기
        if(num1%num2 == 0){//만약 num1을 num2로 나누었을 때 0이라면
            return num2; //num1과 num2의 최대 공약수는 num2 라는 것이므로 num2 리턴
        }
        return get_gcd(num2, num1%num2);//나누어지지 않는다면 num2와 num1을 num2로 나눈 나머지로 함수 재귀호출
    }
}