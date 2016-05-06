package ir.bitwise.quizgame.test;

import ir.bitwise.quizgame.callbacks.AnswerCallback;
import ir.bitwise.quizgame.callbacks.CreateCallback;
import ir.bitwise.quizgame.callbacks.StartCallback;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.TurnBasedHttpGameIo;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.TurnBasedTopicQuizGame;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBAnswerResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBCreateResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBStartResponse;

/**
 * Created by Bardya on 5/6/2016.
 */
public class Test implements CreateCallback<TBCreateResponse>, StartCallback<TBStartResponse>, AnswerCallback<TBAnswerResponse> {

    public Test() {
        TurnBasedTopicQuizGame game = new TurnBasedTopicQuizGame
                .TurnBasedGameBuilder()
                .io(new TurnBasedHttpGameIo())
                .createCallback(this)
                .startCallback(this)
                .answerCallback(this)
                .userId("x")
                .opponentId("y")
                .topicId("z")
                .build();

        game.create();
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
