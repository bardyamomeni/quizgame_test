package ir.bitwise.quizgame.spi.topic.spi.singleplayer;

import ir.bitwise.quizgame.QuizGameIo;
import ir.bitwise.quizgame.model.Answer;
import ir.bitwise.quizgame.spi.topic.TopicQuizGame;
import ir.bitwise.quizgame.spi.topic.spi.singleplayer.model.SPAnswerResponse;
import ir.bitwise.quizgame.spi.topic.spi.singleplayer.model.SPCreateResponse;
import ir.bitwise.quizgame.spi.topic.spi.singleplayer.model.SPStartResponse;

/**
 * Created by Bardya on 5/6/2016.
 */
public class SinglePlayerTopicQuizGame extends TopicQuizGame<SPCreateResponse,SPStartResponse,SPAnswerResponse>{

    protected SinglePlayerTopicQuizGame(QuizGameIo io,String userId,String topic) {
        super(null,null,null,null);
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
