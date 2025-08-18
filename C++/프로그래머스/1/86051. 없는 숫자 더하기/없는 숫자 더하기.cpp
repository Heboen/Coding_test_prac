#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> numbers) {
    int answer = 0;
    int i = 0;
    sort(numbers.begin(), numbers.end());
    for(i ; i < 10; i++){
        int cnt = 0;
        for(int j = 0; j < numbers.size(); j++){
            if(i != numbers[j]){
                cnt++;
            }
        }
        if(cnt == numbers.size()){
            answer += i;
        }
    }
    return answer;
}