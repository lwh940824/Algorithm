import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import programmers.SKtelecom.P_1;
import programmers.SKtelecom.P_2;
import programmers.SKtelecom.P_3;


public class TestClass {
    @Test
    @Disabled
    void 테스트1() {
        int[] p = {2, 5, 3, 1, 4};
        P_1 p1 = new P_1();
        p1.solution(p);
    }

    @Test
    @Disabled
    void 테스트2() {
        int[] periods = {20, 23, 24};
        int[][] payments = {{100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000},
                {100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000},
                {350000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000}};
        int[] estimates = {100000, 100000, 100000};
        int[] periods2 = {24, 59, 59, 60};
        int[][] payments2 = {{50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000},
                {50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000},
                {350000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000},
                {50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000}};
        int[] estimates2 = {350000, 50000, 40000, 50000};
        P_2 p2 = new P_2();
        p2.solution(periods, payments, estimates);
    }

    @Test
//    @Disabled
    void 테스트3() {
        int n = 5;
        String[] plans = {"100 1 3", "500 4", "2000 5"};
        String[] clients = {"300 3 5", "1500 1", "100 1 3", "50 1 2"};
        P_3 p3 = new P_3();
        p3.solution(n, plans, clients);
    }
}
