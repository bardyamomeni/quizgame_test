package ir.bitwise.quizgame;

import ir.bitwise.quizgame.callbacks.*;
import ir.bitwise.quizgame.model.Answer;

/**
 * Created by Bardya on 5/5/2016.
 */
public class TopicQuizGame extends QuizGame{

    protected TopicQuizGame(QuizGameIo quizGameIo) {
        super(quizGameIo);
    }

    private static class Builder extends QuizGame.Builder<TopicQuizGame>{
        protected String topicId;

        public Builder topic(String topicId){
            this.topicId = topicId;
            return this;
        }



        public TopicQuizGame build() {

            return null;
        }
    }

    public static Builder newBuilder(){
        return new Builder();
    }

    public void create(CreateCallback callback) {

    }

    public void start(StartCallback startCallback) {

    }

    public void answer(Answer answer, AnswerCallback answerCallback) {

    }

    public void skip(SkipCallback skipCallback) {

    }

    public void cancel(CancelCallback cancelCallback) {

    }
}
