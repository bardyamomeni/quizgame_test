package ir.bitwise.quizgame.test;

import ir.bitwise.quizgame.spi.topic.TopicQuizGame;
import ir.bitwise.quizgame.spi.topic.Builder;
import ir.bitwise.quizgame.spi.topic.model.TopicQuizGameCreateResponse;
import ir.bitwise.quizgame.callbacks.CreateCallback;

/**
 * Created by Bardya on 5/6/2016.
 */
public class Test {

    public Test() {

        TopicQuizGame topicQuizGame = new Builder().userId("x").topic("y").build();

        topicQuizGame.create(new CreateCallback<TopicQuizGameCreateResponse>() {

            public void onCreated(TopicQuizGameCreateResponse topicQuizGameCreateResponse) {

            }

            public void onCreateFailed() {

            }
        });
    }
}
