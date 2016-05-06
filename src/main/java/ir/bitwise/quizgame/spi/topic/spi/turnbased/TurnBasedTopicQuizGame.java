package ir.bitwise.quizgame.spi.topic.spi.turnbased;


import ir.bitwise.quizgame.QuizGameIo;
import ir.bitwise.quizgame.model.Answer;
import ir.bitwise.quizgame.spi.topic.TopicQuizGame;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBAnswerResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBCreateResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBStartResponse;

/**
 * Created by Bardya on 5/6/2016.
 */
public class TurnBasedTopicQuizGame extends TopicQuizGame<TBCreateResponse, TBStartResponse, TBAnswerResponse> {

    String opponentId;

    TurnBasedTopicQuizGame(QuizGameIo io, String userId, String topic, String opponentId) {
        super(io, userId, topic);
        this.opponentId = opponentId;
    }

    public void create() {

    }

    public void start() {

    }

    public void answer(Answer answer) {

    }

    public void skip() {

    }

    public void cancel() {

    }
}
