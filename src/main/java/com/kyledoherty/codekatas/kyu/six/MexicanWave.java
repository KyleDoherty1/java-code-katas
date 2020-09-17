package com.kyledoherty.codekatas.kyu.six;

import java.util.Arrays;

//https://www.codewars.com/kata/58f5c63f1e26ecda7e000029/train/java
public class MexicanWave {

    public static String[] wave(String str) {
        //Set array MexicanWave with length of string minus any whitespaces
        String[] mexicanWave = new String[str.replace(" ", "").length()];

        Arrays.fill(mexicanWave, str);

        int charPointer = 0;
        for (int i = 0; i < mexicanWave.length; i++) {
            char[] currentWord = mexicanWave[i].toCharArray();
            while(currentWord[charPointer] == ' ')
                charPointer++;

            currentWord[charPointer] = Character.toUpperCase(currentWord[charPointer]);
            mexicanWave[i] = new String(currentWord);
            charPointer++;

        }
        return mexicanWave;
    }

}
