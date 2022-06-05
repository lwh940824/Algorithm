package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_11660_X { // 구간 합 구하기 5
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 구간합 구하기
        int[][] arr = new int[n][n];
        int[][] sum = new int[n][n];
        for(int i=0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j < n; j++) {
                if(i == 0 && j == 0) {
                    sum[i][j] = Integer.parseInt(st.nextToken());
                } else if(j == 0) {
                    sum[i][j] = sum[i-1][n-1] + Integer.parseInt(st.nextToken());
                } else {
                    sum[i][j] = sum[i][j-1] + Integer.parseInt(st.nextToken());
                }
            }
        }

        // 좌표 구간 합 구하기
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        while(m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) -1;
            int y1 = Integer.parseInt(st.nextToken()) -1;
            int x2 = Integer.parseInt(st.nextToken()) -1;
            int y2 = Integer.parseInt(st.nextToken()) -1;

            if(x1 == x2 && y1 == y2) {
                if(x1 == 0 && y1== 0) answer = sum[x2][y2];
                else if(y1 == 0 && y2 == 0) answer = sum[x2][y2] - sum[x2-1][sum[0].length-1];
                else answer = sum[x2][y2] - sum[x2][y2-1];
            }
            else if(x1 == 0 && y1 == 0) {
                answer = sum[x2][y2];
            }
            else {
                answer = sum[x2][y2] - sum[x1][y1];
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}