package Programmers;

public class 외계어사전 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"p","o","s"},new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        }
    public static int solution(String[] spell, String[] dic) {
        int answer = 2;
        int[] answerArr = new int[spell.length];
        int count = 0;
        for(int i = 0; i < dic.length; i++) {
            for(int l = 0; l < answerArr.length; l++) {
                if(count == answerArr.length){
                    return 1;
                }
                if(answerArr[l] == 1){
                    count++;
                }
            }
            for(int j = 0; j < spell.length; j++) {
                for(int k = 0; k < dic[j].length(); k++){
                    if(dic[i].charAt(j) == spell[k].charAt(k)){
                        answerArr[k]++;
                    }
                }
            }
        }
        return answer;
    }
}
