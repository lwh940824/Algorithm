import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q_2164 { // 카드2
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i < n; i++) {
            queue.add(i+1);
        }

        for(int i=0; i < n; i++) {
            if(queue.size() == 1) System.out.println(queue.poll());
            else {
                queue.remove();
                int move = queue.poll();
                queue.add(move);
            }
        }
    }
}
