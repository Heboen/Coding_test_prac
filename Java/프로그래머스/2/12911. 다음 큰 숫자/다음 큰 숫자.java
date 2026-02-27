import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String bin = Integer.toBinaryString(n);
        bin = bin.replace("0","");
        String bin2 = "";
        int n2 = n;
        while(!(bin.length() == bin2.length())){
            n2 = n2+ 1;
            bin2 = Integer.toBinaryString(n2);
            bin2 = bin2.replace("0","");
            
        }
        // n2 = n + 1;
        // bin2 = Integer.toBinaryString(n2);
        // bin = bin.replace("0","");
        // bin2 = bin2.replace("0","");
        // System.out.println(bin2);
        return n2;
    }
}