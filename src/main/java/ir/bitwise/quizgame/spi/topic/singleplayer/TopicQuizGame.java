package ir.bitwise.quizgame.spi.topic.singleplayer;

import ir.bitwise.quizgame.QuizGame;
import ir.bitwise.quizgame.callbacks.*;
import ir.bitwise.quizgame.model.Answer;
import ir.bitwise.quizgame.spi.topic.singleplayer.model.TopicGameAnswerResponse;
import ir.bitwise.quizgame.spi.topic.singleplayer.model.TopicGameStartResponse;
import ir.bitwise.quizgame.spi.topic.singleplayer.model.TopicQuizGameCreateResponse;

/**
 * Created by Bardya on 5/5/2016.
 */
public class TopicQuizGame extends QuizGame<TopicQuizGameCreateResponse,TopicGameStartResponse,TopicGameAnswerResponse> {

    String topic;

    protected TopicQuizGame(TopicQuizGameBuilder builder) {
        super(builder);
        this.topic = builder.getTopic();
    }

    public void create(CreateCallback<TopicQuizGameCreateResponse> callback) {

    }

    public void start(StartCallback<TopicGameStartResponse> startCallback) {


    }

    public void answer(Answer answer, AnswerCallback<TopicGameAnswerResponse> answerCallback) {

    }

    public void skip(SkipCallback skipCallback) {

    }

    public void cancel(CancelCallback cancelCallback) {

    }
}
