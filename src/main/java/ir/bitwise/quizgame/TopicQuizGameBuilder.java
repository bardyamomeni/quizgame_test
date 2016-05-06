package ir.bitwise.quizgame;

/**
 * Created by Bardya on 5/6/2016.
 */
public class TopicQuizGameBuilder extends QuizGameBuilder<TopicQuizGameBuilder> {

    private String topic;

    public TopicQuizGameBuilder topic(String topic){
        this.topic = topic;
        return getThis();
    }

    public TopicQuizGameBuilder getThis() {
        return this;
    }


    public TopicQuizGame build(){
        TopicQuizGame topicQuizGame = new TopicQuizGame(null);
        topicQuizGame.topic = topic;
        topicQuizGame.userId = userId;
        return topicQuizGame;

    }



}
