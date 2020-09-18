package com.kyledoherty.codekatas.kyu.six;

import java.util.HashMap;

//https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
public class FindOdd {

    public static int findIt(int[] sequence) {

        HashMap<Integer, Integer> intOccurences = new HashMap<Integer, Integer>();

        for(int i: sequence){
            if(!(intOccurences.containsKey(i)))
                intOccurences.put(i, 1);
            else
                intOccurences.put(i, intOccurences.get(i)+1);
        }

        for(HashMap.Entry<Integer, Integer> entry : intOccurences.entrySet())
            if(entry.getValue() % 2 == 1)
                return entry.getKey();

        return 0;
    }

}
