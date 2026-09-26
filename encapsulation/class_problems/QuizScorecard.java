class QuizScorecard {

    private boolean[] results;
    private int count;

    QuizScorecard(int totalQuestions) {
        results = new boolean[totalQuestions];
        count = 0;
    }

    void recordAnswer(boolean correct) {

        if (count < results.length) {
            results[count] = correct;
            count++;
        }
    }

    int getScore() {

        int score = 0;

        for (int i = 0; i < count; i++) {
            if (results[i]) {
                score++;
            }
        }

        return score;
    }

    public static void main(String[] args) {

        QuizScorecard quiz = new QuizScorecard(4);

        quiz.recordAnswer(true);
        quiz.recordAnswer(true);
        quiz.recordAnswer(false);
        quiz.recordAnswer(true);

        System.out.println("Score: " + quiz.getScore());
    }
}