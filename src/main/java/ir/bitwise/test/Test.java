package ir.bitwise.test;

import ir.bitwise.quizgame.callbacks.AnswerCallback;
import ir.bitwise.quizgame.callbacks.CreateCallback;
import ir.bitwise.quizgame.callbacks.StartCallback;
import ir.bitwise.quizgame.io.spi.HttpGameIo;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.TurnBaseQuizGameBuilder;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.TurnBasedTopicQuizGame;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBAnswerResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBCreateResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBStartResponse;

/**
 * Created by Bardya on 5/6/2016.
 */
public class Test implements CreateCallback<TBCreateResponse>, StartCallback<TBStartResponse>, AnswerCallback<TBAnswerResponse> {

    public Test() {
        TurnBasedTopicQuizGame game = new TurnBaseQuizGameBuilder()
                .io(new HttpGameIo())
                .createCallback(this)
                .startCallback(this)
                .answerCallback(this)
                .userId("x")
                .opponentId("y")
                .topicId("z")
                .build();

        game.create(new CreateCallback<TBCreateResponse>() {
            @Override
            public void onCreated(TBCreateResponse o) {

            }

            @Override
            public void onCreateFailed() {

            }
        });
    }

    public static void main(String[] args) {
        new Test();
    }

    @Override
    public void onCreated(TBCreateResponse tbCreateResponse) {

    }

    @Override
    public void onCreateFailed() {

    }

    @Override
    public void onAnswered(TBAnswerResponse answerResponse) {

    }

    @Override
    public void onAnswerFailed() {

    }

    @Override
    public void onStarted(TBStartResponse startResponse) {

    }

    @Override
    public void onStartFailed() {

    }
}
