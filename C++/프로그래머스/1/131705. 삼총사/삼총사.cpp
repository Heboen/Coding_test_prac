#include <string>
#include <vector>

using namespace std;

int solution(vector<int> number) {
    int answer = 0;
    for(int i = 0; i< number.size(); i++){
        for(int j = i+1; j < number.size(); j++){
            for(int r = j+1; r < number.size(); r++){
                if(number[i]+number[j]+number[r] == 0){
                    answer += 1;
                }
            }
        }
        
    }
    return answer;
}