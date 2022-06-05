package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Q_11659{ // 구간 합 구하기 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 수의 개수
        int m = Integer.parseInt(st.nextToken()); // 합을 구해야 하는 횟수
        int answer = 0;

        int[] numbers = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // n 개의 수

        // 구간 합 구하기
        int[] sum = new int[n];
        sum[0] = numbers[0];

        for (int q = 1; q < numbers.length; q++) {
            sum[q] = numbers[q] + sum[q - 1];
        }

        while(m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // i번째부터 j번째 까지의 합
            if (i != 1) {
                answer = sum[j - 1] - sum[i - 2];
            } else {
                answer = sum[j - 1];
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}