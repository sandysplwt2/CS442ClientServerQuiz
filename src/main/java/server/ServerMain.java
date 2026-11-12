package server;

import shared.Question;
import shared.QuestionBank;
import shared.QuestionLoader;

public class ServerMain {

    public static void main(String[] args) {

        // Load the question bank from questions.json
        QuestionBank bank =
                QuestionLoader.loadQuestions();

        System.out.println("Loaded "
                + bank.getQuestions().size()
                + " questions.");

        // Display the first question.
        // This code is simply an example showing
        // how to access the question bank.
        if (!bank.getQuestions().isEmpty()) {

            Question q =
                    bank.getQuestions().get(0);

            System.out.println(
                    q.getQuestion());

            for (String choice :
                    q.getChoices()) {

                System.out.println(
                        "  " + choice);
            }
        }

        System.out.println();
        System.out.println(
                "Replace this example code "
                + "with your server implementation.");
    }
}