import baekjoon.Baek7568;
import baekjoon.큐_10845;
import inflearn.Array_6;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestClass {


    @Test
    @Disabled
    void 테스트() {
        int[][] atmos1 = new int[][]{{80, 35}, {70, 38}, {100, 41}, {75, 30}, {160, 80}, {77, 29}, {181, 68}, {151, 76}};


        Question_1 question1 = new Question_1();

        question1.solution(atmos1);
    }

    @Test
//    @Disabled
    void 테스트_2() throws IOException {

        큐_10845 queue_ = new 큐_10845();
        queue_.solution();
    }

    @Test
    @Disabled
    void 테스트_3 () throws IOException {
        큐_10845 queue_ = new 큐_10845();
        queue_.solution();
    }
}
