package Programmers.level1;

public class 숫자문자열과영단여 {

    public static void main(String[] args) {

        String s = "1zero7eight";
        System.out.println(solution(s));
    }
        public static int solution(String s) {
            String[] strDigits = {"zero","one","two","three","four","five","six","seven","eight","nine"};
            for(int i = 0 ; i<10; i++){
                s=s.replace(strDigits[i],Integer.toString(i));
            }


            int answer = Integer.parseInt(s);


            return answer;
        }
    }

