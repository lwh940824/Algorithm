import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2750 { // 수 정렬하기
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        
        for(int i=0; i < n; i++){
            list[i] = Integer.parseInt(br.readLine());
        }

        for(int i=1; i < n; i++) {
            int target = list[i];
            for(int j=i-1; j >= 0; j--) {
                if(target < list[j]) {
                    int temp = list[j];
                    list[j] = target;
                    list[j+1] = temp;
                    target = list[j];
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int x : list) {
            sb.append(x).append("\n");
        }
        System.out.println(sb);
    }
}
