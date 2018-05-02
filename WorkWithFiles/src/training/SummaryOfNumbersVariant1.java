package training;

import java.util.*;

public class SummaryOfNumbersVariant1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] mas = new int[N];
        for (int i = 0; i < N; i++) {
            mas[i] = in.nextInt();
        }
        long start = System.currentTimeMillis();
        //  int[] n = {1,2,3,4,100};
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
    }
}
