package ir.bitwise.quizgame;

import ir.bitwise.quizgame.callbacks.*;
import ir.bitwise.quizgame.model.Answer;

/**
 * Created by Bardya on 5/5/2016.
 */
public class TopicQuizGame extends QuizGame<TopicQuizGameCreateResponse>{

    String topic;

    TopicQuizGame(QuizGameIo quizGameIo) {
        super(quizGameIo);
    }

    public void create(CreateCallback<TopicQuizGameCreateResponse> callback) {

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
