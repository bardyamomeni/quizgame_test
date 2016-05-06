package ir.bitwise.quizgame.test;

import ir.bitwise.quizgame.TopicQuizGame;
import ir.bitwise.quizgame.TopicQuizGameBuilder;
import ir.bitwise.quizgame.TopicQuizGameCreateResponse;
import ir.bitwise.quizgame.callbacks.CreateCallback;

/**
 * Created by Bardya on 5/6/2016.
 */
public class Test {

    public Test() {

        TopicQuizGame topicQuizGame = new TopicQuizGameBuilder().userId("x").topic("y").build();

        topicQuizGame.create(new CreateCallback<TopicQuizGameCreateResponse>() {

            public void onCreated(TopicQuizGameCreateResponse topicQuizGameCreateResponse) {

            }

            public void onCreateFailed() {

            }
        });
    }
}
