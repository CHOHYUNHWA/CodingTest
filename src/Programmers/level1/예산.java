package Programmers.level1;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(solution(d,budget));
//테스트 케이스
    }
    public static int solution(int[] d, int budget){
        int answer = 0; // 배열이 예산을 넘는지 넘지않는지 확인할 변수 선언 및 초기화
        int count = 0; // 최대 몇개의 부서에 예산을 줄수잇는지 변수 선언 및 초기화
        Arrays.sort(d); // 작은값부터 넣으면 최대치가 나오므로 정렬
        for(int i =0; i<d.length; i++){
            answer = answer + d[i]; //예산값과 비교하기 위해서 작은수 부터 반복하여 더함
            if(answer > budget){ //예산보다 큰지 작은지 비교
                return count;} //만약 예산보다 커지면 count 리턴
            count++;//더해질때마다 예산 분배 후 count++

        }

        return count;
        // 만약 answer 과 budget이 동일할 경우 위 조건문에서 리턴 되지 않으므로 해당 count 리턴
    }
}