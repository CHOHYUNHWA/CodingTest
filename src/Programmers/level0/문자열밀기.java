package Programmers.level0;

import java.util.Arrays;

public class 문자열밀기 {
    public static void main(String[] args) {
        System.out.println(solution("hello","ohell"));
    }
    public static int solution(String A, String B) {
        int answer = -1;
        if(A.equals(B)){
            return 0;
        }
        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        char[] head = new char[1];
        char[] tail = new char[arrA.length -1];
        for(int i = 1; i <= A.length(); i++) {
            head[0] = arrA[arrA.length - 1];
            tail = Arrays.copyOfRange(arrA,0,arrA.length-1);
            System.arraycopy(head,0,arrA,0,1);
            System.arraycopy(tail,0,arrA,1,tail.length);
            if(String.valueOf(arrA).equals(String.valueOf(arrB))){
                answer = i;
                break;
            }
            System.out.println(Arrays.toString(arrA));
        }
        return answer;
    }
}
