package ir.bitwise.quizgame.spi.topic;

import ir.bitwise.quizgame.QuizGameBuilder;

/**
 * Created by Bardya on 5/6/2016.
 */
public class Builder extends QuizGameBuilder<Builder> {

    private String topic;

    public String getTopic() {
        return topic;
    }

    public Builder topic(String topic) {
        this.topic = topic;
        return getThis();
    }

    public Builder getThis() {
        return this;
    }

    public TopicQuizGame build() {
        return new TopicQuizGame(this);
    }

}
