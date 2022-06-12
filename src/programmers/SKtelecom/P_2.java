package programmers.SKtelecom;

import java.util.Arrays;

public class P_2{ // 이름
    public int[] solution(int[] periods, int[][] payments, int[] estimates){
        int[] answer = new int[2];

        for(int i=0; i < periods.length; i++){
            int recent = 0;
            int recentNextMonth = 0;
            int firstPrice = payments[i][0];

            for(int j=0; j < payments[i].length; j++) {
                // 각 고객 별 12개월 납부 금액(이번 달)
                recent += payments[i][j];
            }
            // 각 고객 별 12개월 납부 금액(다음 달)
            recentNextMonth = recent - firstPrice + estimates[i];

            boolean vipCurrent = vipJud(periods[i] ,recent); // 이번 달 VIP
            boolean vipNext = vipJud(periods[i]+1 ,recentNextMonth); // 다음 달 VIP
            if(!vipCurrent && vipNext) // 이번 달 VIP 아니고 다음 달 VIP 인지
                answer[0]++;
            if(vipCurrent && !vipNext) // 이번 달 VIP 이고 다음 달 VIP 아닌지
                answer[1]++;
        }
        return answer;
    }

    public boolean vipJud(int periods, int price){
        boolean result = false;
        if(price >= 900000 && periods >= 24) result = true;
        else if(price >= 600000 && periods >= 60) result = true;
        return result;
    }
}