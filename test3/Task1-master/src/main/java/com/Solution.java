package com;

public class Solution {

    public int getSquareCount(int a, int b){
        int count = 0;
            for (; a <= b; a++) {
                if (Math.sqrt(a) % 1 == 0) {
                    count++;
                }
            }
    return count;
    }
}
