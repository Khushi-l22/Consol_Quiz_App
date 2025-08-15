package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Question {
    String questionText;
    String[] options;
    int correctAnswerIndex;

    public Question(String questionText, String[] options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }
}

    public class Quiz_app {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<Question> questions = new ArrayList<>();

            // Adding sample questions
            questions.add(new Question(
                    "Which language is used for Android Development?",
                    new String[]{"C#", "Java", "Python", "Ruby"}, 2
            ));
            questions.add(new Question(
                    "Which keyword is used to inherit a class in Java?",
                    new String[]{"extends", "implements", "inherits", "instanceof"}, 1
            ));

            int score = 0;

            // Quiz loop
            for (Question q : questions) {
                System.out.println(q.questionText);
                for (int i = 0; i < q.options.length; i++) {
                    System.out.println((i + 1) + ". " + q.options[i]);
                }
                System.out.print("Your answer: ");
                int answer = sc.nextInt();

                if (answer == q.correctAnswerIndex) {
                    score++;
                }
            }

            System.out.println("\nQuiz Over! Your Score: " + score + "/" + questions.size());
            sc.close();
        }
    }

