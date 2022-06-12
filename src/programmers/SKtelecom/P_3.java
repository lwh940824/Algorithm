package programmers.SKtelecom;

import java.util.Arrays;
import java.util.stream.Stream;

public class P_3 {
    public int[] solution(int n, String[] plans, String[] clients) {
        int[] answer = new int[clients.length];
        int answerIdx = 0;
        int[] addtionsArr = {};
        String addtionsString = "";

        int[][] plansArr = new int[plans.length][];
        int[] dataArr = new int[plansArr.length];

        for(int i=0; i < plans.length; i++){
            int[] planToInt = Stream.of(plans[i].split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] addtions = new int[planToInt.length-1 + addtionsArr.length];
            plansArr[i] = new int[addtions.length + addtionsArr.length];

            System.out.println("----");
            System.out.println(Arrays.toString(addtionsArr));
            for(int j=0; j < addtionsArr.length; j++) addtions[j] = addtionsArr[j];
            int idx = 0;
            if(addtionsArr.length == 0) idx = 0;
            else idx = addtionsArr.length;
            for( int j=1; j < planToInt.length; j++){
                addtions[idx++] = planToInt[j]; // 제공 부가서비스
                addtionsString += planToInt[j] + " ";
            }
            addtionsArr = Stream.of(addtionsString.split(" ")).mapToInt(Integer::parseInt).toArray();

            int data = planToInt[0]; // 제공 데이터
            plansArr[i] = addtionsArr;
            dataArr[i] = data;

            System.out.println(dataArr[i] + "   " + Arrays.toString(plansArr[i]));
        }

        int clientAddtionArr[] = {};
        for(int i=0; i < clients.length; i++) {
            clientAddtionArr = Stream.of(clients[i].split(" ")).mapToInt(Integer::parseInt).toArray();
            int clientData = clientAddtionArr[0];
            int [] clientAddtions = new int[clientAddtionArr.length-1];

            for( int j=1; j < clientAddtionArr.length; j++){
                clientAddtions[j-1] = clientAddtionArr[j]; // 제공 부가서비스
            }

            boolean isChecked = true;
            int findNumber = 0;
            for(int j=0; j < plansArr.length; j++) {
                for(int x : clientAddtions) {
                    for(int k=0; k < plansArr[j].length; k++) {
                        if(!(plansArr[j][k] == x)) {
                            isChecked = false;
                        }
                    }
                }
                if(isChecked) findNumber = j; // findNumber 이상에서 데이터 맞는 조건 찾기
            }
            for(int j=findNumber; j < dataArr.length; j++) {
                if(dataArr[j] >= clientAddtionArr[0]) answer[answerIdx] = j+1;
            }
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
    // 이분탐색
}
