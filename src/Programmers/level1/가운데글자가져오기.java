package Programmers.level1;


class 가운데글자가져오기 {
    public static void main(String[] args) {
        System.out.println(solution("abcdef"));
    } //테스트 코드

    public static String solution(String s) {
        double dummy = (double) s.length()/2; //s.length() 는 int값으로 만약 정수로 나누어지지 않을시 나머지를 버린다.
        //그러므로 double형으로 형변환 하며 변수에 값을 담아준다.
        if(s.length()%2 ==1){ //문자열 길이가 홀수인경우
            String result = Character.toString(s.charAt((int) Math.ceil(dummy)-1));
            //Math.ceil 메서드로 올림처리 후 int 값으로 형변환 후 char타입을 string 타입으로 형변환 후 변수 result에 담는다.
            return result;
        }
        if(s.length()%2==0){//문자열의 길이가 짝수인경우
            String result2 = Character.toString(s.charAt(s.length()/2-1))+Character.toString(s.charAt(s.length()/2));
            //문자열의 길이가 홀수임으로 가운데 두 문자를 String으로 형변환 후 더해준다.
            return result2;
        }
        return null;
    }
}///