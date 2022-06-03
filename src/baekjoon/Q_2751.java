import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2751 { // 수 정렬하기 2
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        int[] counting = new int[2000001];
        int[] sortResult = new int[2000001];
        
        for(int i=0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine())+1000000;
        }

        for(int i=0; i < list.length; i++) {
            counting[list[i]]++;
        }

        for(int i=1; i < list.length; i++) {
            counting[i] += counting[i-1];
        }

        for(int i=list.length-1; i >= 0; i--) {
            int value = list[i];
            counting[value] -= 1;
            sortResult[counting[value]] = value;
        }

        StringBuilder sb = new StringBuilder();
        for(int x : sortResult) {
            sb.append((x - 1000000)).append("\n");
        }
        System.out.println(sb);
    }
}
