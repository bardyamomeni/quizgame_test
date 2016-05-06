package ir.bitwise.quizgame.spi.topic;

import ir.bitwise.quizgame.CallBackGroup;
import ir.bitwise.quizgame.QuizGame;
import ir.bitwise.quizgame.QuizGameIo;

/**
 * Created by Bardya on 5/5/2016.
 */
public abstract class TopicQuizGame<C,S,A> extends QuizGame<C,S,A> {

    String topic;

    protected TopicQuizGame(CallBackGroup<C,S,A> callBackGroup,QuizGameIo io, String userId, String topic) {
        super(callBackGroup,io,userId);
        this.topic = topic;
    }

}
