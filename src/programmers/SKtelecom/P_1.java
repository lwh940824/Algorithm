package programmers.SKtelecom;

public class P_1{ // 이름
    public int[] solution(int[] p){
        int[] answer = {};
        int[] count_p = new int[p.length];
        int currentNum = 0;
        int temp = 0;
        int idx = 0;

        for(int i=0; i < p.length; i++){
            int min = p[i];
            for(int j=i+1; j < p.length; j++){
                currentNum = p[j];
                if(min > currentNum){
                    min = currentNum;
                    idx = j;
                }
            }
            if(p[i] != min){
                temp = p[i];
                p[i] = min;
                p[idx] = temp;
                count_p[i]++;
                count_p[idx]++;
            }
        }
        answer = count_p;

        return answer;
    }
}