package Programmers;

public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        String phone_number = "0123456789";
        System.out.println(solution(phone_number));
    } //테스트 코드
    public static String solution(String phone_number) {
        String answer = ""; //정답을 닮을 빈문자열 선언
        for(int i =0 ; i<phone_number.length()-4; i++){
            answer = answer +"*";
        } //반복문으로 phonenumber의 끝 4자리를 제외한 앞자리를 *로 수정한 값을 answer 에 할당
        String dummy =phone_number.substring(phone_number.length()-4); //끝자리 4자리를 dummy에 할당
        answer = answer+dummy; // answer 와 dummy를 더하여 answer 에 할당
        return answer; //결과값 반환
    }
}
