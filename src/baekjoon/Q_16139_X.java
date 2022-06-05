package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_16139_X { // 인간-컴퓨터 상호작용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int q = Integer.parseInt(br.readLine());

        // 알파벳 별 누적합 구하기
        int[][] alphabet = new int[27][str.length()+1];
        for(int i=0; i < str.length(); i++) {
            int curChar = str.charAt(i) - 'a' + 1;
            for(int j=0; j < alphabet.length; j++) {
                if(curChar == j) {
                    alphabet[j][j] = alphabet[curChar][j-1] + 1;
                } else {
                    alphabet[curChar][j] = alphabet[curChar][j-1] + 0;
                }
            }
        }

        // 질문 별 알파벳 누적합 출력
        while(q-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int curAlphabet = st.nextToken().charAt(0) - 'a';
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int answer = alphabet[curAlphabet][end] - alphabet[curAlphabet][start];

            System.out.println(answer);
            System.out.println(answer);
        }
    }
}