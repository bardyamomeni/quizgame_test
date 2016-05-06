package ir.bitwise.quizgame.spi.topic.spi.turnbased;

import ir.bitwise.quizgame.QuizGame;
import ir.bitwise.quizgame.io.Parser;
import ir.bitwise.quizgame.io.QuizGameIoListener;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBAnswerResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBCreateResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBStartResponse;

/**
 * Created by Bardya on 5/6/2016.
 */
public class TurnBaseGameResponseParser extends Parser<TBCreateResponse,TBStartResponse,TBAnswerResponse>{

    @Override
    protected TBCreateResponse parseCreateResponseImpl(String input) {
        return null;
    }

    @Override
    protected TBStartResponse parseStartResponseImpl(String input) {
        return null;
    }

    @Override
    protected TBAnswerResponse parseAnswerResponseImpl(String input) {
        return null;
    }
}
