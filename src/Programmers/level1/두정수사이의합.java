package Programmers.level1;

import java.util.ArrayList;

public class 두정수사이의합 {
    public static void main(String[] args) {
        System.out.println(solution(5,3));
    }
    //테스트 케이스
    public static long solution(int a, int b) {
        ArrayList<Integer> resultList = new ArrayList<>(); // 결과를 닮을 어레이리스트 생성
        int result = 0; //어레이리스트에서 모두 더한 합을 최종 결과값을 받을 result 초기화
        if(a == b){  //만약 a,b가 같으면 해당숫자를 리턴
            return a;
        }
        int c = 0; //변수를 닮을 c 초기화
        int d = 0; //변수를 닮을 d 초기화
        c = Math.max(a,b);  //a,b 비교후 큰값을 c로 지정
        d = Math.min(a,b);  //a,b 비교후 작은값을 d로 지정
        int i = 0; //while 문 int 값 초기화
        while(i<=c-d){ //while 문 으로 (Min값)c에서 1씩 더해가며 (Max값)d까지 반복
            resultList.add(d+i); // i가 반복하며 해당값을 어레이리스트에 저장
            result = result + resultList.get(i); //어레이리스트 값을 결과값에 하나씩 더해줌
            i++; // 증감식
        }
        return result; // 결과 리턴
    }
}

//초기 수도코드
// a 와 b 를 비교하여 작은 숫자를 c 큰숫자를 d 로 할당 한다.
// 반복문을 통하여 c+ 1 씩 더한 값을 어레이리스트에 넣어준다.
// a+i = b 가 되면 반복문을 종료시킨다.
// 반복문으로 어레이리스트값을 모두 더한뒤 리턴한다.

