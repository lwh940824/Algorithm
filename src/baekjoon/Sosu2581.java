package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sosu2581 {
    public void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        boolean isChecked = true;
        boolean minChecked = true;
        int sum = 0;
        int min = 0;

        for(int i=M; M <= N; i++){
            isChecked = true;
            for(int j=2; j < i; j++){
                if(i%j==0){
                    isChecked = false;
                }
            }
            if(isChecked) {
                sum+=i;
                if(minChecked){
                    min = i;
                    minChecked = false;
                }
            }
        }
        System.out.println(sum + "\n" + min);
    }
}
