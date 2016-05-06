package ir.bitwise.quizgame.spi.topic;

import ir.bitwise.quizgame.QuizGame;
import ir.bitwise.quizgame.io.QuizGameIo;

/**
 * Created by Bardya on 5/5/2016.
 */
public abstract class TopicQuizGame<C,S,A> extends QuizGame<C,S,A> {

    String topic;

    protected TopicQuizGame(QuizGameIo<C,S,A> io, String userId, String topic) {
        super(io,userId);
        this.topic = topic;
    }

}
