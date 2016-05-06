package ir.bitwise.quizgame;

import ir.bitwise.quizgame.callbacks.*;
import ir.bitwise.quizgame.model.Answer;

/**
 * Created by Bardya on 5/5/2016.
 */
public abstract class QuizGame<CreateResponse> {

    QuizGameIo quizGameIo;
    String userId;

    protected QuizGame(QuizGameIo quizGameIo){
        this.quizGameIo = quizGameIo;
    }

    public abstract void create(CreateCallback<CreateResponse> callback);
    public abstract void start(StartCallback startCallback);
    public abstract void answer(Answer answer, AnswerCallback answerCallback);
    public abstract void skip(SkipCallback skipCallback);
    public abstract void cancel(CancelCallback cancelCallback);
}
