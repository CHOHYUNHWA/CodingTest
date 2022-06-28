package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 소수만들기 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(solution(nums));
    }

    static int result = 0;
    static int cnt = 0;
    static ArrayList<Integer> tmp = new ArrayList<>();

    public static int solution(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    tmp.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        for(int i = 0 ; i < tmp.size(); i++){
            int cnt = 0;
            for(int j = 1; j <= tmp.get(i) / 2; j++){
                if(tmp.get(i) % j == 0)
                    cnt++;
                if(cnt == 2)
                    break;
            }
            if(cnt == 1)
                result++;
        }
        return result;
    }
}
