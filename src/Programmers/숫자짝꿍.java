package Programmers;


class 옹알이 {
    public static void main(String[] args) {
        String[] babbling = {"ayaye", "ye", "woo", "ma" };
        System.out.println(solution(babbling));
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String words[] = {"aya", "ye", "woo", "ma" };
        for(int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < words.length; j++) {
                    babbling[i] = babbling[i].replace(words[j], "1");
            }
            if (babbling[i].equals("1") ||
                    babbling[i].equals("11") ||
                    babbling[i].equals("111") ||
                    babbling[i].equals("1111")) {
                answer++;
            }
        }
        return answer;
    }
}


