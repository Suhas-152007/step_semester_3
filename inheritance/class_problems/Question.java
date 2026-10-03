import java.util.*;

abstract class Question {

    String correctAnswer;
    String studentAnswer;
    double points;

    Question(String correctAnswer, String studentAnswer, double points) {
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.points = points;
    }

    abstract double getScore();
}

class MCQ extends Question {

    MCQ(String correctAnswer, String studentAnswer, double points) {
        super(correctAnswer, studentAnswer, points);
    }

    double getScore() {

        if (studentAnswer.equals(correctAnswer)) {
            return points;
        }

        return 0;
    }
}

class TF extends Question {

    TF(String correctAnswer, String studentAnswer, double points) {
        super(correctAnswer, studentAnswer, points);
    }

    double getScore() {

        if (studentAnswer.equals(correctAnswer)) {
            return points;
        }

        return 0;
    }
}

class Essay extends Question {

    Essay(String correctAnswer, String studentAnswer, double points) {
        super(correctAnswer, studentAnswer, points);
    }

    double getScore() {

        String[] keywords =
                correctAnswer.toLowerCase().split(",");

        String answer =
                studentAnswer.toLowerCase();

        int count = 0;

        for (String keyword : keywords) {

            keyword = keyword.trim();

            if (answer.contains(keyword)) {
                count++;
            }
        }

        if (count >= 2) {
            return points * 0.75;
        }
        else if (count == 1) {
            return points * 0.50;
        }

        return 0;
    }
}

public class ExamGrader {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        double total = 0;

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();

            String type = line.substring(
                    0, line.indexOf(" ")
            );

            // Simple handling for quoted fields
            String[] values = line.split("\"");

            String correctAnswer = values[3].trim();
            String studentAnswer = values[5].trim();

            String lastPart = values[6].trim();

            double points = Double.parseDouble(lastPart);

            Question question;

            if (type.equals("MCQ")) {

                question = new MCQ(
                        correctAnswer,
                        studentAnswer,
                        points
                );

            }
            else if (type.equals("TF")) {

                question = new TF(
                        correctAnswer,
                        studentAnswer,
                        points
                );

            }
            else {

                question = new Essay(
                        correctAnswer,
                        studentAnswer,
                        points
                );
            }

            double score = question.getScore();

            System.out.printf(
                    "%s: %.2f\n",
                    type,
                    score
            );

            total = total + score;
        }

        System.out.printf(
                "Total Score: %.2f\n",
                total
        );
    }
}