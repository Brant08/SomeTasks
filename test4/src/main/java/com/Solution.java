package com;

public class Solution {
    public int getDurationOfWinter(int [] t){
        int index = 0;
        int lastPos = t.length - 1;
        int j = lastPos;
        for(int i = 0; i < j;){
            if(t[i] < t[j] && j > index){
                j--;
            } else if (t[i] >= t[j] && j > index){
                i++;
                index = j;
                j = lastPos;
            } else {
                i++;
                j = lastPos;
            }
        }
    return index + 1;
    }
}
