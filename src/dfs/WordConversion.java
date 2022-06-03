package dfs;

import java.util.Arrays;

public class WordConversion {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] isEqual = new boolean[begin.length()];
        boolean[] isChecked = new boolean[words.length];
        boolean equal = false;
        int cnt = 0;
        String temp = "";

        for(int i=0; i < words.length; i++)
            if(!isChecked[i]){
                equal = dfs(temp, target, i, words,isEqual, cnt, isChecked);
                if(equal) {
                    System.out.println("찾았다");
                    System.out.println(words[i]);
                    answer++;
                }
            }
        int test = 0;
        for(int i=0; i < begin.length(); i++){
            if(isEqual[i] == true){
                test++;
            }
        }
        if(test != begin.length()) answer = -1;
        return answer;
    }

    boolean dfs(String begin, String target, int i, String[] words, boolean[] isEqual, int cnt,boolean[] isChecked){
        isChecked[i] = true;
        boolean equal = false;
        for(int j=0; j < begin.length(); j++){
            int index = target.indexOf(words[i].charAt(j));
            if(index != -1) System.out.println(index);
            if(index != -1 && isEqual[index] == false) {
                isEqual[index] = true;
                cnt++;
                equal = true;
                break;
            }
        }
        return equal;
    }
}