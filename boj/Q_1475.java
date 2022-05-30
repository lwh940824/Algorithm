import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q_1475{ // 방 번호
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] room = br.readLine().toCharArray();
        HashMap<Character, Integer> num = new HashMap<>();
        int max = 0;
        for(char x : room){
            if(x == '9') x = '6';
            num.put(x, num.getOrDefault(x, 0) + 1);
            if(num.get(x) > max) {
                if(x == '6' || x == '9') {
                    if(num.get(x) % 2 == 0)
                        max = num.get(x) / 2;
                    else max = num.get(x) / 2 + 1;
                } else {
                    max = num.get(x);
                }
                
            }
        }
        System.out.println(max);
    }
}