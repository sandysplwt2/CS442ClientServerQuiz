package shared;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Loads questions from src/main/resources/questions.json.
 *
 * Most students only need to call:
 *
 * QuestionBank bank =
 *         QuestionLoader.loadQuestions();
 *
 * Once loaded, use:
 *
 * bank.getQuestions()
 *
 * to access the available review questions.
 */
public class QuestionLoader {

    public static QuestionBank loadQuestions() {

        InputStream stream =
                QuestionLoader.class
                        .getClassLoader()
                        .getResourceAsStream("questions.json");

        if (stream == null) {
            throw new RuntimeException(
                    "Unable to locate questions.json");
        }

        try (Reader reader =
                     new InputStreamReader(stream)) {

            Gson gson = new Gson();

            return gson.fromJson(
                    reader,
                    QuestionBank.class);
        }
        catch (Exception ex) {

            throw new RuntimeException(
                    "Unable to load questions.json",
                    ex);
        }
    }
}