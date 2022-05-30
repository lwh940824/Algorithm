import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_2750{ // 이름
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        for(int i=0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        for(int i=1; i < n; i++) {
            for(int j=i-1; j > 0; j--) {
                System.out.println("11");
                if(list[i] > list[j]) {
                    break;
                } else {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;

                    System.out.println(Arrays.toString(list)); 
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}