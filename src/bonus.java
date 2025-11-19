import java.util.Random;
public class bonus {
    public static void main(String[] args) {
        Random rand = new Random();
        int students = 5;
        int quizzes = 4;
        int[][] scores = new int[students][quizzes];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quizzes; j++) {
                scores[i][j] = rand.nextInt(101);
            }
        }
        System.out.println("Scores table:");
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quizzes; j++) {
                System.out.printf("%4d", scores[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nStudent averages:");
        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < quizzes; j++) {
                sum += scores[i][j];
            }
            double avg = (double) sum / quizzes;
            System.out.printf("Student %d average: %.2f%n", i, avg);
        }
        System.out.println("\nQuiz averages:");
        for (int j = 0; j < quizzes; j++) {
            int sum = 0;
            for (int i = 0; i < students; i++) {
                sum += scores[i][j];
            }
            double avg = (double) sum / students;
            System.out.printf("Quiz %d average: %.2f%n", j, avg);
        }
        int maxScore = -1;
        int maxStudent = -1;
        int maxQuiz = -1;
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quizzes; j++) {
                if (scores[i][j] > maxScore) {
                    maxScore = scores[i][j];
                    maxStudent = i;
                    maxQuiz = j;
                }
            }
        }
        System.out.println("\nHighest score: " + maxScore +
                " at (studentIndex=" + maxStudent + ", quizIndex=" + maxQuiz + ")");
    }
}