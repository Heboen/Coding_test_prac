class Solution {
    public String solution(String s) {
        String answer = "";
        if (Character.isLowerCase(s.charAt(0))) answer += Character.toUpperCase(s.charAt(0));
        else answer += s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            char a = s.charAt(i);
            
            if (s.charAt(i-1) == ' ' && Character.isLowerCase(a)){
                a = Character.toUpperCase(a);
            }
            if (s.charAt(i-1) != ' ' && Character.isUpperCase(a)){
                a = Character.toLowerCase(a);
            }
            answer += a;
            
        }
        
        return answer;
    }
}