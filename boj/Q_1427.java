import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Q_1427 { // 소트인사이드
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        Integer[] newArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(newArr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(int x : newArr) {
            sb.append(x);
        }
        System.out.println(sb);
    }
}
