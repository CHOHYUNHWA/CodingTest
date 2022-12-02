package Programmers;

public class 문자열계산하기 {
    public static void main(String[] args) {
        System.out.println(solution("5 + 7 + 5"));
    }
    public static int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        answer = Integer.parseInt(arr[0]);
        for(int i = 1; i< arr.length; i++){
            if(arr[i].equals("+")){
                answer += Integer.parseInt(arr[i+1]);
            }if(arr[i].equals("-")){
                answer -= Integer.parseInt(arr[i+1]);
            }
        }
        return answer;
    }
}