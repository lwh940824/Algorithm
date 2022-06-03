public class Question_1 {

        public int solution(int[][] atmos) {

            int answer = 0;
            int maskedDays = 0;

            for(int i=0; i < atmos.length; i++){
                    int fineDust = atmos[i][0];
                    int ultraFineDust = atmos[i][1];
                    // fd : 81 이상, ufd : 36 이상 => 착용 => 둘 다 나쁨 당일 버림
                    if (fineDust >= 151 && ultraFineDust >= 76) {
                        maskedDays = 0;
                        answer++;
                    } else if (fineDust >= 81) {
                        maskedDays++;
                    } else if (ultraFineDust >= 36) {
                        maskedDays++;
                    } else {
                        if(maskedDays != 0){
                            maskedDays++;
                        }
                    }
                    if(maskedDays == 3 || (maskedDays != 0 && i == atmos.length-1)){
                        maskedDays = 0;
                        answer++;
                    }
                }
            return answer;
        }
}
