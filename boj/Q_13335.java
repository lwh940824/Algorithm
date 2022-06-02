import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Stream;

import javax.swing.plaf.TreeUI;

public class Q_13335{ // 트럭
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 트럭 수
        int w = Integer.parseInt(st.nextToken()); // 다리의 길이
        int l = Integer.parseInt(st.nextToken()); // 다리 최대하중

        int cnt = 0; // 지난 시간
        ArrayList<Integer> bridge = new ArrayList<>();
        int currentWeight = 0;
        
        // 각 트럭 무게 배열
        int[] trucks = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Queue<Integer> queue = new LinkedList<>();

        for(int x : trucks) {
            // queue 사이즈는 w, w안에 무게는 l을 넘을 수 없음
            System.out.println(x);
            while(true) {
                if(queue.size() <= 2 && currentWeight + x <= l) {
                    queue.add(x);
                    currentWeight += x;
                    bridge[queue.size()-1] = 1;
                    System.out.println("add : " + queue);
                    cnt++;
                    break;
                }

                for(int i=0; i < bridge.length; i++) {
                    if(bridge[i] != 0) {
                        bridge[i] += 1;
                    }
                    // System.out.println(bridge[0]);
                }

                if(bridge[0] == 3) {
                    int passWeight = queue.poll();
                    bridge[0] = 0;
                    currentWeight -= passWeight;
                    System.out.println("poll : " + queue);
                    cnt++;
                }
            }
            
        }
        System.out.println(cnt);
    }
}