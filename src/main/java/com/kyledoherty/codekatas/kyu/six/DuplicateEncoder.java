package com.kyledoherty.codekatas.kyu.six;

//https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
public class DuplicateEncoder {
    static String encode(String word){
        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result.append(word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")");
        }
        return result.toString();
    }
    /*static String encode(String word){
        word = word.toLowerCase();

        StringBuilder answer = new StringBuilder();
        Hashtable<Character, Integer> charsInWord = new Hashtable<Character, Integer>();

        for(char c: word.toCharArray()){
            Integer count = charsInWord.get(c);
            if(count == null)
                charsInWord.put(c,1);
            else
                charsInWord.put(c, ++count);
        }

        for(char c: word.toCharArray()){
            if(charsInWord.get(c).intValue() > 1)
                answer.append(")");
            else
                answer.append("(");
        }

        return answer.toString();
    }*/
}

