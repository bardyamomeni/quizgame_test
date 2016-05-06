package ir.bitwise.quizgame;

import ir.bitwise.quizgame.callbacks.AnswerCallback;
import ir.bitwise.quizgame.callbacks.CreateCallback;
import ir.bitwise.quizgame.callbacks.StartCallback;
import ir.bitwise.quizgame.model.Answer;

/**
 * Created by Bardya on 5/5/2016.
 */
public abstract class QuizGame<CreateResponse, StartResponse, AnswerResponse> {

    private QuizGameIo quizGameIo;
    private String userId;
    private CreateCallback<CreateResponse> createCallback;
    private StartCallback<StartResponse> startCallback;
    private AnswerCallback<AnswerResponse> answerCallback;

    protected QuizGame(QuizGameIo io, String userId) {

    }

    public CreateCallback<CreateResponse> getCreateCallback() {
        return createCallback;
    }

    public StartCallback<StartResponse> getStartCallback() {
        return startCallback;
    }

    public AnswerCallback<AnswerResponse> getAnswerCallback() {
        return answerCallback;
    }

    public QuizGameIo getQuizGameIo() {
        return quizGameIo;
    }

    public String getUserId() {
        return userId;
    }

    public abstract void create();

    public abstract void start();

    public abstract void answer(Answer answer);

    public abstract void skip();

    public abstract void cancel();
}
