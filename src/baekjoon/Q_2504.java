import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Q_2504{ // 단어 뒤집기2
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] str = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean isNot = false;
        String tmp = "";
        String resultStr = "";
        char lastChar = str[str.length-1];

        for(char x : str) {
            if(lastChar == x) {
                tmp += x;
                x = ' ';
            }
            if(x != ' ' && x != '<' && x != '>') {
                System.out.println("1111");
                stack.push(x);
                tmp += x;
            } else if(x == '<' || x == ' ' || x == lastChar){
                System.out.println("2222");
                System.out.println();
                int lt = 0, rt = tmp.length()-1;
                System.out.println(tmp.length());
                char[] tmpChar = tmp.toCharArray();
                System.out.println(Arrays.toString(tmpChar));
                while(lt < rt) {
                    if(!Character.isAlphabetic(tmpChar[lt])) lt++;
                    if(!Character.isAlphabetic(tmpChar[rt])) rt--;
                    if(Character.isAlphabetic(tmpChar[lt]) && Character.isAlphabetic(tmpChar[rt])) {
                        char temp = tmpChar[lt];
                        tmpChar[lt] = tmpChar[rt];
                        tmpChar[rt] = temp;
                        lt++;
                        rt--;
                    }
                }
                tmp = "";
                sb.append(String.valueOf(tmpChar));
            }
        }
        System.out.println("?");
        System.out.println(sb);
    }
}
// (()[[]])([])
    