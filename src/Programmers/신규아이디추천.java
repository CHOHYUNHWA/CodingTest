package Programmers;


public class 신규아이디추천 {
    public static void main(String[] args) {
        String new_id = 	"=.=";
        System.out.println(solution(new_id));


    }
    public static String solution(String new_id) {;

        String result = new_id.toLowerCase(); //1단계
        result = result.replaceAll("[^-_.a-z0-9]", ""); //2단계
        result = result.replaceAll("[.]{2,}", "."); //3단계 ("[.]{2,}", ".")
        result = result.replaceAll("^[.]", ""); //4단계 ("^[.]|[.]$", "")
        result = result.replaceAll("[.]$", ""); //4단계
        if(result.equals("")){ //5단계
            result = "a";
        }
        if(result.length()>=16)  result = result.substring(0,15); //6단계
        result = result.replaceAll("[.]$", "");
        if(result.length() == 1){  //7단계
            result = result + result.charAt(0);
        }
        if(result.length() == 2){
            result = result + result.charAt(1);
        }

        return result;
    }
}


