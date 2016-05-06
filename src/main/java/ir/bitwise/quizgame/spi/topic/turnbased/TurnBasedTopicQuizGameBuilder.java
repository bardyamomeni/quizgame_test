package ir.bitwise.quizgame.spi.topic.turnbased;

import ir.bitwise.quizgame.QuizGame;
import ir.bitwise.quizgame.QuizGameBuilder;
import ir.bitwise.quizgame.spi.topic.singleplayer.TopicQuizGame;
import ir.bitwise.quizgame.spi.topic.singleplayer.TopicQuizGameBuilder;

/**
 * Created by Bardya on 5/6/2016.
 */
public class TurnBasedTopicQuizGameBuilder extends TopicQuizGameBuilder {

    private String opponentId;

    public TurnBasedTopicQuizGameBuilder getThis() {
        return this;
    }

    public TurnBasedTopicQuizGameBuilder opponentId(String opponentId){
        this.opponentId = opponentId;
        return this;
    }

    @Override
    public TurnBasedTopicQuizGameBuilder topic(String topic) {
        TopicQuizGameBuilder b =  super.topic(topic);
        this.topic = b.getTopic();
        return this;
    }


    @SuppressWarnings("unchecked")
    @Override
    public <T extends QuizGame> T build() {
        return (T) new TurnBasedTopicQuizGame(this);
    }
}
