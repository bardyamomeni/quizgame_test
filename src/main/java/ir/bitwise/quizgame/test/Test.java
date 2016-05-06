package ir.bitwise.quizgame.test;

import ir.bitwise.quizgame.QuizGameIo;
import ir.bitwise.quizgame.spi.topic.singleplayer.TopicQuizGame;
import ir.bitwise.quizgame.spi.topic.singleplayer.TopicQuizGameBuilder;
import ir.bitwise.quizgame.spi.topic.singleplayer.model.TopicQuizGameCreateResponse;
import ir.bitwise.quizgame.callbacks.CreateCallback;
import ir.bitwise.quizgame.spi.topic.turnbased.TurnBasedTopicQuizGame;
import ir.bitwise.quizgame.spi.topic.turnbased.TurnBasedTopicQuizGameBuilder;

/**
 * Created by Bardya on 5/6/2016.
 */
public class Test {

    public static void main(String[] args) {
        new Test();
    }

    public Test() {

        TopicQuizGame topicQuizGame = new TopicQuizGameBuilder().userId("x").gameIo(new QuizGameIo()).topic("y").build();

        topicQuizGame.create(new CreateCallback<TopicQuizGameCreateResponse>() {

            public void onCreated(TopicQuizGameCreateResponse topicQuizGameCreateResponse) {

            }

            public void onCreateFailed() {

            }
        });

        TurnBasedTopicQuizGame t = new TurnBasedTopicQuizGameBuilder()
                .gameIo(new QuizGameIo())
                .userId("x")
                .topic("y")
                .build();
    }
}
