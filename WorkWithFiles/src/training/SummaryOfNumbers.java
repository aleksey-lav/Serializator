package training;

public class SummaryOfNumbers {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,100};

        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        System.out.println(sum);

    }

}
