package training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimeScope {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("e:\\queries.txt\\"));

        long start = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        while(in.hasNextLine()){
            list.add(Integer.parseInt(in.nextLine()));
        }
        int N = list.size();
        System.out.println("N = " + N);
        int[] mas = new int[N];
        for (int i = 0; i < N; i++) {
            mas[i] = list.get(i);
        }

        long sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        System.out.println("sum = " + sum);
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start) + " ms");
    }
}