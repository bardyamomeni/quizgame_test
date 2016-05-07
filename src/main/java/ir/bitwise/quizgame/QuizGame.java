package ir.bitwise.quizgame;

import ir.bitwise.quizgame.callbacks.AnswerCallback;
import ir.bitwise.quizgame.callbacks.CreateCallback;
import ir.bitwise.quizgame.callbacks.StartCallback;
import ir.bitwise.quizgame.io.QuizGameIo;
import ir.bitwise.quizgame.model.Answer;

/**
 * Created by Bardya on 5/5/2016.
 */
public abstract class QuizGame {

    private QuizGameIo quizGameIo;
    private String userId;
    private CreateCallback createCallback;
    private StartCallback startCallback;
    private AnswerCallback answerCallback;

    protected QuizGame(QuizGameIo io, String userId) {
        this.quizGameIo = io;
        this.userId = userId;
    }

    public CreateCallback getCreateCallback() {
        return createCallback;
    }

    public void setCreateCallback(CreateCallback createCallback) {
        this.createCallback = createCallback;
    }

    public StartCallback getStartCallback() {
        return startCallback;
    }

    public void setStartCallback(StartCallback startCallback) {
        this.startCallback = startCallback;
    }

    public AnswerCallback getAnswerCallback() {
        return answerCallback;
    }

    public void setAnswerCallback(AnswerCallback answerCallback) {
        this.answerCallback = answerCallback;
    }

    public QuizGameIo getQuizGameIo() {
        return quizGameIo;
    }

    public String getUserId() {
        return userId;
    }

    public abstract <T> void create(CreateCallback<T> callback);

    public abstract <T> void start(StartCallback<T> startCallback);

    public abstract <T> void answer(Answer answer, AnswerCallback<T> answerCallback);

    public abstract void skip();

    public abstract void cancel();

}
