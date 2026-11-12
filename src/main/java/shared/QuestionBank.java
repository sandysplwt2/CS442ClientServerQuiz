package shared;

import java.util.List;

/**
 * Stores the complete collection of questions loaded from questions.json.
 *
 * Example:
 *
 * QuestionBank bank = QuestionLoader.loadQuestions();
 *
 * List<Question> questions = bank.getQuestions();
 *
 * System.out.println("Loaded "
 *         + questions.size()
 *         + " questions.");
 */
public class QuestionBank {

    private List<Question> questions;

    public List<Question> getQuestions() {
        return questions;
    }
}