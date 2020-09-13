package com.kyledoherty.codekatas;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
        /*StringBuilder answer = new StringBuilder();
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
        return answer.toString();*/
    }


}
