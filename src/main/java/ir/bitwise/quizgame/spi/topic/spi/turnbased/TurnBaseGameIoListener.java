package ir.bitwise.quizgame.spi.topic.spi.turnbased;

import ir.bitwise.quizgame.io.QuizGameIoListener;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBAnswerResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBCreateResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBStartResponse;

/**
 * Created by Bardya on 5/6/2016.
 */
public class TurnBaseGameIoListener implements QuizGameIoListener<TBCreateResponse,TBStartResponse,TBAnswerResponse> {

    @Override
    public void onCreateResponse(TBCreateResponse tbCreateResponse) {

    }

    @Override
    public void onStartResponse(TBStartResponse tbStartResponse) {

    }

    @Override
    public void onAnswerResponse(TBAnswerResponse tbAnswerResponse) {

    }
}
