package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Q_13335{ // 트럭
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 트럭 수
        int w = Integer.parseInt(st.nextToken()); // 다리의 길이
        int l = Integer.parseInt(st.nextToken()); // 다리 최대하중

        int cnt = 0; // 지난 시간
        int[] bridge = new int[w];
        int currentWeight = 0;
        
        // 각 트럭 무게 배열
        int[] trucks = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int x : trucks) {
            // queue 사이즈는 w, w안에 무게는 l을 넘을 수 없음
            while(true) {
                cnt++;

                int escape = bridge[0];
                currentWeight -= escape;

                for(int i=1; i < bridge.length; i++) {
                    bridge[i-1] = bridge[i];
                    bridge[i] = 0;
                }
                if(currentWeight + x <= l) {
                    bridge[bridge.length-1] = x;
                    currentWeight += x;
                    break;
                }
            }
        }
        System.out.println(cnt + w);
    }
}