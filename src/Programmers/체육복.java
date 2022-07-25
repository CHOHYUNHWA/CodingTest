package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3};
        System.out.println(solution(n,lost,reserve));
    } //테스트 코드


    public static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);  //배열 정렬
        Arrays.sort(reserve); //배열 정렬
        int answer = 0;
        //정답을 담을 선언 및 초기화
        int count = 0;
        //체육복을 빌려주어 체육복을 입을수있는 학생을 담을 변수 선언 및 초기화
        for(int i = 0 ; i <lost.length; i++){
            for(int j = 0; j< reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }// 반복문으로 reserve와 lost가 동일할 경우를 count
        for(int i = 0; i<lost.length; i++){
            for(int j =0; j<reserve.length; j++){
                if(reserve[j]+1 == lost[i] || reserve[j]-1 == lost[i]){
                    count++;
                    reserve[i] = -1;
                    break;
                }
            }
        }//reserve 와 lost 가 다른경우 빌려줄수 있는 경우 count
        answer = n -lost.length+count; // lost에 count를 빼서 answer에 할당
        return answer;
    }
}