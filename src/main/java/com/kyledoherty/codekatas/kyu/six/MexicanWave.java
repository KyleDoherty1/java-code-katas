package com.kyledoherty.codekatas.kyu.six;

//https://www.codewars.com/kata/58f5c63f1e26ecda7e000029/train/java
public class MexicanWave {

    public static String[] wave(String str) {
        //Set array MexicanWave with length of string minus any whitespaces
        String[] mexicanWave = new String[str.replace(" ", "").length()];

        int charPointer = 0;
        for (int i = 0; i < mexicanWave.length; i++) {
            char[] currentWord = str.toCharArray();

            while(currentWord[charPointer] == ' ')
                charPointer++;

            currentWord[charPointer] = Character.toUpperCase(currentWord[charPointer]);
            mexicanWave[i] = new String(currentWord);
            charPointer++;
        }
        return mexicanWave;
    }

    /*
    public static String[] wave(String str) {
      List<String> list = new ArrayList<>();
      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == ' ') continue;
        list.add(str.substring(0,i) + Character.toUpperCase(ch) + str.substring(i+1));
      }
      return list.toArray(new String[0]);
    }
     */

}
