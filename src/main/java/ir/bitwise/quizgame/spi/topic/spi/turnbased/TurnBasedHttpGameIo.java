package ir.bitwise.quizgame.spi.topic.spi.turnbased;

import ir.bitwise.quizgame.io.spi.HttpGameIo;
import ir.bitwise.quizgame.model.KeyValueBundle;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBAnswerResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBCreateResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBStartResponse;

/**
 * Created by Bardya on 5/6/2016.
 */
public class TurnBasedHttpGameIo extends HttpGameIo<TBCreateResponse,TBStartResponse,TBAnswerResponse> {

    @Override
    protected String createRequestImpl(KeyValueBundle bundle) {
        return null;
    }

    @Override
    protected String startRequestImpl(KeyValueBundle bundle) {
        return null;
    }

    @Override
    protected String answerRequestImpl(KeyValueBundle bundle) {
        return null;
    }

}
