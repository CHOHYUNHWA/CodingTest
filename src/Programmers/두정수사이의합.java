package Programmers;

import java.util.ArrayList;

public class 두정수사이의합 {
    public static void main(String[] args) {
        System.out.println(solution(5,3));
    }
    public static long solution(int a, int b) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int result = 0;
        if(a == b){
            return a;
        }
        int c = 0;
        int d = 0;
        c = Math.max(a,b);
        d = Math.min(a,b);
        int i = 0;
        while(i<=c-d){
            resultList.add(d+i);
            result = result + resultList.get(i);
            i++;
        }
        return result;
    }
}
// a 와 b 를 비교하여 작은 숫자를 a 큰숫자를 b 로 할당 한다.
// 반복문을 통하여 a+ 1 씩 더한 값을 어레이리스트에 넣어준다.
// a+i = b 가 되면 반복문을 종료시킨다.
// 반복문으로 어레이리스트값을 모두 더한뒤 리턴한다.

