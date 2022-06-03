import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q_2108 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] counting = new int[8001];
        int sum = 0;
        int maxCount = Integer.MIN_VALUE;
        boolean over = false;
        int mode = 0;
        
        for(int i=0; i < n; i++) {
            int num = Integer.parseInt(br.readLine()) + 4000;
            counting[num]++;
            sum += (num - 4000);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i <= counting.length-1; i++) {
            int cur = counting[i];
            while(cur > 0) {
                if(maxCount < counting[i]) {
                    maxCount = counting[i];
                    mode = i - 4000;
                    over = true;
                }
                if(maxCount == counting[i] && over == true) {
                    mode = i - 4000;
                    over = false;
                }
                arr.add(i-4000);
                cur--;
            }
        }
        int avg =(int)Math.round((double)sum / (double)n);
        System.out.println("평균 : " + avg);
        System.out.println("sum : " + sum /n);

        int mid = arr.get(arr.size()/2);
        int range = arr.get(arr.size()-1) - arr.get(0);

        StringBuilder sb = new StringBuilder();
        sb.append(avg).append("\n");
        sb.append(mid).append("\n");
        sb.append(mode).append("\n");
        sb.append(range).append("\n");

        System.out.println(sb);
    }
}