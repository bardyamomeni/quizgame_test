package ir.bitwise.quizgame;

import ir.bitwise.quizgame.callbacks.*;
import ir.bitwise.quizgame.model.Answer;

/**
 * Created by Bardya on 5/5/2016.
 */
public abstract class QuizGame {

    private QuizGameIo quizGameIo;

    protected QuizGame(QuizGameIo quizGameIo){
        this.quizGameIo = quizGameIo;
    }

    protected static abstract class Builder<T extends QuizGame>{

        protected String userId;

        protected Builder() {
        }

        public Builder userId(String userid){
            this.userId = userid;
            return this;
        }

        public abstract T build();
    }

    public static Builder newBuilder(){
        return new Builder(){
            public QuizGame build() {
                return null;
            }
        };
    }

    public abstract void create(CreateCallback callback);
    public abstract void start(StartCallback startCallback);
    public abstract void answer(Answer answer, AnswerCallback answerCallback);
    public abstract void skip(SkipCallback skipCallback);
    public abstract void cancel(CancelCallback cancelCallback);
}
