package ir.bitwise.quizgame.spi.topic.singleplayer;

import ir.bitwise.quizgame.QuizGame;
import ir.bitwise.quizgame.QuizGameBuilder;

/**
 * Created by Bardya on 5/6/2016.
 */
public class TopicQuizGameBuilder extends QuizGameBuilder<TopicQuizGameBuilder> {

    protected String topic;

    public String getTopic() {
        return topic;
    }

    public TopicQuizGameBuilder topic(String topic) {
        this.topic = topic;
        return this;
    }

    public TopicQuizGameBuilder getThis() {
        return this;
    }

    @SuppressWarnings("unchecked")
    public <T extends QuizGame> T build() {
        return (T) new TopicQuizGame(this);
    }

}
