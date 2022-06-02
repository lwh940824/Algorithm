import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_13985{ // 평등
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        int a = str[0] - '0';
        int b = str[4] - '0';
        int c = str[8] - '0';
        if(a + b == c) System.out.println("YES");
        else System.out.println("NO");
    }
}