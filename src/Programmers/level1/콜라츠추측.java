package Programmers.level1;

public class 콜라츠추측 {
    public static void main(String[] args) {
        System.out.println(solution(6));
    }

        public static int solution(long num) {
            int count = 0; //500회가 되면 멈출 변수지정
            for(int i = 0; i<500; i++){ //for문으로 순회 500회 이상은 -1 을 리턴하므로 범위는 500지정

                if(count >= 500){ //카운트가 500이상이 될시 -1을 리턴
                    return -1;}
                if(num == 1){ //num이 1일 경우 0을 리턴
                    return count;
                }
                if(num%2 == 0){ // num이 짝수인 경우
                    num = num/2;
                }else{ //num이 홀수인경우
                    num = num*3+1;
                }
                count++;
            }
            return -1;
        }
    }

