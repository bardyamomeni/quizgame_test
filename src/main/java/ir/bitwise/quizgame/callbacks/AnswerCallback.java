package ir.bitwise.quizgame.callbacks;

/**
 * Created by Bardya on 5/5/2016.
 */
public interface AnswerCallback<T> {

    void onAnswered(T answerResponse);

    void onAnswerFailed();
}
