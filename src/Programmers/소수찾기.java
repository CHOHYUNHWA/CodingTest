package Programmers;

import java.util.ArrayList;
import java.util.List;

class 소수찾기 {
    public static int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(i % list.get(j) == 0) break;
                if(list.size() == j+1) list.add(i);
            }
        }

        return list.size();
    }
}
