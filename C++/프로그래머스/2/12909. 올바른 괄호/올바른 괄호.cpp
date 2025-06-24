#include<string>
#include <iostream>

using namespace std;

bool solution(string s)
{
    
    int r = 0;
    for(char c: s){
        if (c == '(') r++;
        else if (c == ')') r--;
        
        if (r < 0) return false;
    }
    if (r == 0) return true;
    else return false;
    
}