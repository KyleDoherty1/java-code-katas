package com.kyledoherty.codekatas;

public class Accumul {
    public static String accum(String s) {
        String answer = "";
        char[] sArray = s.toCharArray();
        for(int i = 0; i < sArray.length; i++){
            for(int f = 0; f<=i; f++) {
                if (f == 0)
                    answer += Character.toUpperCase(sArray[i]);
                else
                    answer += Character.toLowerCase(sArray[i]);
            }
            answer += "-";
        }
        return answer.substring(0,answer.length()-1);
    }
}
