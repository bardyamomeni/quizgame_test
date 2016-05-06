package ir.bitwise.quizgame.spi.topic.spi.turnbased;


import ir.bitwise.quizgame.CallBackGroup;
import ir.bitwise.quizgame.QuizGameIo;
import ir.bitwise.quizgame.callbacks.AnswerCallback;
import ir.bitwise.quizgame.callbacks.CreateCallback;
import ir.bitwise.quizgame.callbacks.StartCallback;
import ir.bitwise.quizgame.model.Answer;
import ir.bitwise.quizgame.spi.topic.TopicQuizGame;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBAnswerResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBCreateResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBStartResponse;

/**
 * Created by Bardya on 5/6/2016.
 */
public class TurnBasedTopicQuizGame extends TopicQuizGame<TBCreateResponse, TBStartResponse, TBAnswerResponse> {

    private final TurnBasedGameBuilder builder;
    String opponentId;

    protected TurnBasedTopicQuizGame(TurnBasedGameBuilder builder) {
        super(builder.callBackGroup, builder.gameIo, builder.userId, builder.topicId);
        this.opponentId = builder.opponentId;
        this.builder = builder;
    }

    public void create() {

    }

    public void start() {

    }

    public void answer(Answer answer) {

    }

    public void skip() {

    }

    public void cancel() {

    }

    public TurnBasedGameBuilder newBuilder() {
        return new TurnBasedGameBuilder(builder);
    }

    public static class TurnBasedGameBuilder {
        CallBackGroup<TBCreateResponse, TBStartResponse, TBAnswerResponse> callBackGroup;
        CreateCallback<TBCreateResponse> createCallback;
        StartCallback<TBStartResponse> startCallback;
        AnswerCallback<TBAnswerResponse> answerCallback;
        String userId;
        String topicId;
        String opponentId;
        QuizGameIo gameIo;

        private TurnBasedGameBuilder(TurnBasedGameBuilder builder) {
            this.createCallback = builder.createCallback;
            this.startCallback = builder.startCallback;
            this.answerCallback = builder.answerCallback;
            this.userId = builder.userId;
            this.topicId = builder.topicId;
            this.opponentId = builder.opponentId;
            this.gameIo = builder.gameIo;
        }

        public TurnBasedGameBuilder() {
        }

        public TurnBasedGameBuilder io(QuizGameIo io) {
            this.gameIo = io;
            return this;
        }

        public TurnBasedGameBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public TurnBasedGameBuilder topicId(String topicId) {
            this.topicId = topicId;
            return this;
        }

        public TurnBasedGameBuilder opponentId(String opponentId) {
            this.opponentId = opponentId;
            return this;
        }

        public TurnBasedGameBuilder createCallback(CreateCallback<TBCreateResponse> callback) {
            this.createCallback = callback;
            return this;
        }

        public TurnBasedGameBuilder startCallback(StartCallback<TBStartResponse> callback) {
            this.startCallback = callback;
            return this;
        }

        public TurnBasedGameBuilder answerCallback(AnswerCallback<TBAnswerResponse> callback) {
            this.answerCallback = callback;
            return this;
        }


        public TurnBasedTopicQuizGame build() {
            this.callBackGroup = new CallBackGroup<>(createCallback, startCallback, answerCallback);
            return new TurnBasedTopicQuizGame(this);
        }
    }
}
