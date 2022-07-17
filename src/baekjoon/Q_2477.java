package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2477{ // 참외밭
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] arr = new int[6][2];
        arr[0][0] = Integer.parseInt(st.nextToken());
        arr[0][1] = Integer.parseInt(st.nextToken());
        for(int i=1; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int max_width = Integer.MIN_VALUE;
        int max_length = Integer.MIN_VALUE;
        int width = 0;
        int length = 0;

        // 가로, 세로 max값 구하기
        for(int i=0; i < arr[0].length; i++) {
            if((arr[i][0] == 1 || arr[i][0] == 2) && arr[i][1] > max_length)
                max_length = arr[i][1];
            else if((arr[i][0] == 3 || arr[i][0] == 4) && arr[i][1] > max_width)
                max_width = arr[i][1];
        }

        // 빈 사각형 가로, 세로 구하기
        int min_length = Integer.MAX_VALUE;
        int min_width = Integer.MAX_VALUE;
        for(int i=0; i < arr.length; i++) {
            if((arr[i][0] == 1 || arr[i][0] == 2) && arr[i][1] != max_length) {
                if(arr[i][1] < min_length) min_length = arr[i][1];
            } else if((arr[i][0] == 3 || arr[i][0] == 4) && arr[i][1] != max_width) {
                if(arr[i][1] < min_width) min_width = arr[i][1];
            }
        }

        int bigArea = max_length * max_width;
        int smallArea = (max_length - min_length) * (max_width - min_width);

        System.out.println("max : " + bigArea);
        System.out.println("max : " + smallArea);
    }
}