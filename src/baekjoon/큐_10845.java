package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 큐_10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for(int i=0; i < count; i++){
            String[] str = br.readLine().split(" ");
            String action = str[0];
            int num = Integer.parseInt(str[1]);
            switch (action){
                case "push":
                    push(num);
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }
        System.out.println(sb);
    }
    static ArrayList<Integer> queue = new ArrayList<Integer>();
    static StringBuilder sb = new StringBuilder();
    public void solution() throws IOException {

    }

    public static void push(int number){
        queue.add(number);
    }
    public static void pop(){
        if(queue.isEmpty()) sb.append(-1).append("\n");
        else {
            int pop = queue.get(queue.size()-1);
            queue.remove(queue.size()-1);
        }
    }
    public static void size(){
        sb.append(queue.size()).append("\n");
    }
    public static void empty(){
        if(queue.isEmpty()) sb.append(1).append("\n");
        else sb.append(0).append("\n");
    }
    public static void front(){
        if(queue.isEmpty()) sb.append(-1).append("\n");
        else sb.append(queue.get(0)).append("\n");
    }
    public static void back(){
        if(queue.isEmpty()) sb.append(-1).append("\n");
        else sb.append(queue.get(queue.size()-1));
    }
}
