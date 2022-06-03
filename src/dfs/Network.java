package dfs;

public class Network {

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] checked = new boolean[n];

        for(int i=0; i < n; i++){
            if(!checked[i]){
                dfs(computers, i, checked);
                answer++;
            }
        }

        return answer;
    }

    boolean[] dfs(int[][] computers, int i, boolean[] checked) {
        checked[i] = true;

        for(int j=0; j < computers.length; j++){
            if(i != j && computers[i][j] == 1 && checked[j] == false) {
                checked = dfs(computers, j, checked);
            }
        }

        return checked;
    }
}
