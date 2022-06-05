package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2559{ // 수열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] numbers = new int[n];
        for(int i=0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[n-k+1];
        int max = Integer.MIN_VALUE;
        for(int i=0; i < result.length; i++) {
            for(int j=i; j < i+k; j++) {
                result[i] += numbers[j];
            }
            if(max < result[i]) max = result[i];
        }
        System.out.println(Arrays.toString(result));
        System.out.println(max);
    }
}