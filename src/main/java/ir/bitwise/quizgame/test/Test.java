package ir.bitwise.quizgame.test;

import ir.bitwise.quizgame.spi.topic.spi.turnbased.TurnBasedHttpGameIo;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.TurnBasedTopicQuizGame;

/**
 * Created by Bardya on 5/6/2016.
 */
public class Test {

    public static void main(String[] args) {
        new Test();
    }

    public Test() {
        TurnBasedTopicQuizGame.TurnBasedGameBuilder basedGameBuilder;
        basedGameBuilder = new TurnBasedTopicQuizGame.TurnBasedGameBuilder();
        basedGameBuilder.io(new TurnBasedHttpGameIo());
        basedGameBuilder.build();
    }
}
