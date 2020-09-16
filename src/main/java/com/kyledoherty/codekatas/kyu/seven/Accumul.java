package com.kyledoherty.codekatas.kyu.seven;

//https://www.codewars.com/kata/5667e8f4e3f572a8f2000039
public class Accumul {
    public static String accum(String s) {
        StringBuilder answer = new StringBuilder();
        char[] sArray = s.toCharArray();
        for(int i = 0; i < sArray.length; i++){
            for(int f = 0; f<=i; f++) {
                if (f == 0)
                    answer.append(Character.toUpperCase(sArray[i]));
                else
                    answer.append(Character.toLowerCase(sArray[i]));
            }
            answer.append("-");
        }
        return answer.substring(0,answer.length()-1);
    }
}
