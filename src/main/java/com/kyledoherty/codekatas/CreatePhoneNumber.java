package com.kyledoherty.codekatas;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        answer.append("(");
        int index = 0;
        for(int currentDigit: numbers){
            answer.append(currentDigit);
            index++;
            if(index==3)
                answer.append(") ");
            if(index==6)
                answer.append("-");
        }
        return answer.toString();
    }


}
