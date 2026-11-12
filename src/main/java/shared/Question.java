package shared;

import java.util.List;

/**
 * Represents a single multiple-choice question loaded from questions.json.
 *
 * Students should treat this as a read-only object.
 *
 * Example:
 *
 * Question q = bank.getQuestions().get(0);
 *
 * System.out.println(q.getQuestion());
 * System.out.println(q.getChoices().get(0));
 */
public class Question {

    private int id;
    private String category;
    private String question;
    private List<String> choices;
    private int correctAnswer;
    private String explanation;

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getChoices() {
        return choices;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public String getExplanation() {
        return explanation;
    }
}