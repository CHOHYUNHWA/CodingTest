package Programmers;

import java.util.*;
import java.util.stream.Collectors;

public class 소인수분해 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12)));
    }
    public static Integer[] solution(int n) {
//        List<Integer> tmpList = new ArrayList<Integer>();
        Set<Integer> setList = new HashSet<>();
        for(int i = 2; i <= n; i++) {
            if(n%i == 0 ){
//                factor = i;
                n = n/i;
                setList.add(i);
                i = i-1 ;
            }
        }
        Integer[] answer = setList.stream().toArray(Integer[]::new);
        return answer;
    }
}

//Set을 이용해서 따로 중복제거를 해주지않고 구현