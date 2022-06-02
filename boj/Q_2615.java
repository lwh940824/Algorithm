import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2615{ // 오목
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[19][19];
        boolean result = false;

        for(int i=0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[0].length; j++) {
                int user = arr[j][i]; // 출력 위치는 가장 왼쪽에 있는 오목돌을 출력
                if(user != 0) {
                    if(width(arr, user, j, i)) result = true; // 가로 승리 판별
                    else if(heigth(arr, user, j, i)) result = true; // 세로 승리 판별
                    else if(diagonalRight(arr, user, j, i)) result = true; // 대각선 승리 판별
                    else if(diagonalLeft(arr, user, j, i)) result = true; // 대각선 승리 판별
                    if(result) {
                        System.out.println(user);
                        System.out.println((j+1) + " " + (i+1));
                        return;
                    } 
                }
            }
        }
        System.out.println("0");
    }

    public boolean width(int[][] arr, int user, int i, int j) {
        int count = 0;
        int point = j-1;

        while(true) {
            if(j < 19 && arr[i][j++] == user) {
                count++;
            } else {
                break;
            }
        }

        while(true) {
            if(point >= 0 && arr[i][point--] == user) {
                count++;
            } else {
                break;
            }
        }
        if(count == 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean heigth(int[][] arr, int user, int i, int j) {
        int count = 0;
        int point = i-1;

        while(true) {
            if(i < 19 && arr[i++][j] == user) {
                count++;
            } else {
                break;
            }
        }

        while(true) {
            if(point >= 0 && arr[point--][j] == user) {
                count++;
            } else {
                break;
            }
        }
        if(count == 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean diagonalRight(int[][] arr, int user, int i, int j) {
        int count = 0;
        int pointI = i-1;
        int pointJ = j-1;
        while(true) {
            if(i < 19 && j < 19 && arr[i][j] == user) {
                count++;
                i++;
                j++;
            } else {
                break;
            }
        }

        while(true) {
            if(pointI >= 0 && pointJ >= 0 && arr[pointI][pointJ] == user) {
                count++;
                pointI--;
                pointJ--;
            } else {
                break;
            }
        }
        if(count == 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean diagonalLeft(int[][] arr, int user, int i, int j) {
        int count = 0;
        int pointI = i-1;
        int pointJ = j+1;

        while(true) {
            if(i < 19 && j >= 0  && arr[i][j] == user) {
                count++;
                i++;
                j--;
            } else {
                break;
            }
        }

        while(true) {
            if(pointI >= 0 && pointI < 19 && pointJ >=0 && pointJ < 19 && arr[pointI][pointJ] == user) {
                count++;
                pointI--;
                pointJ++;
            } else {
                break;
            }
        }
        if(count == 5) {
            return true;
        } else {
            return false;
        }
    }
}