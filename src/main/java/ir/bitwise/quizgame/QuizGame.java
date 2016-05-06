package ir.bitwise.quizgame;

import ir.bitwise.quizgame.callbacks.*;
import ir.bitwise.quizgame.model.Answer;

/**
 * Created by Bardya on 5/5/2016.
 */
public abstract class QuizGame<CreateResponse, StartResponse, AnswerResponse> {

    private QuizGameIo quizGameIo;
    private String userId;

    protected QuizGame(QuizGameBuilder builder) {
        this.quizGameIo = builder.io;
        this.userId = builder.userId;
    }

    public QuizGameIo getQuizGameIo() {
        return quizGameIo;
    }

    public String getUserId() {
        return userId;
    }

    public abstract void create(CreateCallback<CreateResponse> callback);

    public abstract void start(StartCallback<StartResponse> startCallback);

    public abstract void answer(Answer answer, AnswerCallback<AnswerResponse> answerCallback);

    public abstract void skip(SkipCallback skipCallback);

    public abstract void cancel(CancelCallback cancelCallback);
}
