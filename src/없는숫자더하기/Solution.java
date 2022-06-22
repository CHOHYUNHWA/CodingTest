package 없는숫자더하기;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] numbers) {
        int[] a = {1,2,3,4,5,6,7,8,9,0};
        int answer = 45;
        for(int i = 0; i<10; i++){
            for(int j = 0; j< numbers.length; j++)
            if(a[i] == numbers[j]){
                answer = answer - a[i];
            }
        }
        return answer;
    }
}

