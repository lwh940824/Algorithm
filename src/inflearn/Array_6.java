package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_6 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String sentence = br.readLine();
        String[] numbers = sentence.split(" ");

        boolean[] isDecimal = new boolean[100001];
        isDecimal[0] = isDecimal[1] = true;

        for(int i=2; i * i <= isDecimal.length; i++){
            for(int j=i * i; j <= isDecimal.length; j+=i){
                isDecimal[j] = true;
            }
        }

        System.out.println(isDecimal);

        for(String currentNumber : numbers){

        }
    }
}
