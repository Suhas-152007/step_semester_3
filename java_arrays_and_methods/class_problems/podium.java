import java.util.Scanner;
public class podium {
    public static void main(String[] args) {

        int[] scores = {45, 82, 79, 90, 33, 90, 61};

        int[] result = findTopThreeScores(scores);

        System.out.println("Top 3 scores: [" 
                + result[0] + ", " 
                + result[1] + ", " 
                + result[2] + "]");
    }

    static int[] findTopThreeScores(int[] scores) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int score : scores) {

            if (score > first) {
                third = second;
                second = first;
                first = score;
            }
            else if (score > second) {
                third = second;
                second = score;
            }
            else if (score > third) {
                third = score;
            }
        }

        return new int[]{first, second, third};
    }
}