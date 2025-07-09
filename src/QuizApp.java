import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApp {
        public static void main(String[] args) {
                Scanner inputScanner = new Scanner(System.in);
                List<Question> questionList = new ArrayList<>();

                // 6 simple tech sample questions
                questionList.add(new Question(
                                "What does CPU stand for?",
                                new String[] { "Central Processing Unit", "Computer Personal Unit",
                                                "Central Print Unit",
                                                "Control Processing Unit" },
                                0));
                questionList.add(new Question(
                                "Which company created the Windows operating system?",
                                new String[] { "Apple", "Microsoft", "Google", "IBM" },
                                1));
                questionList.add(new Question(
                                "What is the main language used for web page structure?",
                                new String[] { "HTML", "CSS", "Python", "Java" },
                                0));
                questionList.add(new Question(
                                "Which device is used to connect to a wireless network?",
                                new String[] { "Router", "Monitor", "Printer", "Keyboard" },
                                0));
                questionList.add(new Question(
                                "What does RAM stand for?",
                                new String[] { "Read Access Memory", "Random Access Memory", "Run All Memory",
                                                "Random Application Memory" },
                                1));
                questionList.add(new Question(
                                "Which of these is NOT a programming language?",
                                new String[] { "Python", "JavaScript", "HTML", "C++" },
                                2));

                int score = 0;

                System.out.println("Welcome to the Tech Quiz!\n");

                for (int i = 0; i < questionList.size(); i++) {
                        Question currentQuestion = questionList.get(i);
                        System.out.println("Q" + (i + 1) + ": " + currentQuestion.getQuestionText());

                        String[] options = currentQuestion.getOptions();
                        for (int j = 0; j < options.length; j++) {
                                System.out.println((j + 1) + ". " + options[j]);
                        }

                        System.out.print("Your answer (1-4): ");
                        int userAnswerIndex = inputScanner.nextInt() - 1;

                        if (currentQuestion.isCorrectAnswer(userAnswerIndex)) {
                                System.out.println("Correct!\n");
                                score++;
                        } else {
                                System.out.println("Wrong! Correct answer: "
                                                + options[currentQuestion.getCorrectOptionIndex()] + "\n");
                        }
                }

                // Final Score
                System.out.println("Quiz Finished!");
                System.out.println("Your score: " + score + "/" + questionList.size());

                inputScanner.close();
        }
}