package com.kyledoherty.codekatas.kyu.six;

//https://www.codewars.com/kata/57b06f90e298a7b53d000a86/train/java
public class SuperMarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        if(customers.length < 1) return 0;

        int answer=0;

        int[] tills = new int[n];
        int customerPointer = 0;
        boolean isFinished = false;

        while(!isFinished){
            for (int j = 0; j < tills.length; j++) {
                if(tills[j] == 0 && customerPointer < customers.length){
                    tills[j] = customers[customerPointer];
                    customerPointer++;
                }
            }
            isFinished=true;
            for (int j = 0; j < tills.length; j++) {
                tills[j] = tills[j]-1;
                if(tills[j] >= 1)
                    isFinished = false;
            }

            if(customerPointer < customers.length)
                isFinished = false;

            answer++;
        }
        return answer;
    }

}
