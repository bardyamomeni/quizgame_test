package ir.bitwise.quizgame.spi.topic.spi.turnbased;

import ir.bitwise.quizgame.callbacks.AnswerCallback;
import ir.bitwise.quizgame.callbacks.CreateCallback;
import ir.bitwise.quizgame.callbacks.StartCallback;
import ir.bitwise.quizgame.io.QuizGameIo;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBAnswerResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBCreateResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBStartResponse;

/**
 * =============================== <br></br>
 * Created by b.momeni on 5/7/2016.
 * Email: b.momeni@tgbs.ir
 */
public class TurnBaseQuizGameBuilder {
    CreateCallback<TBCreateResponse> createCallback;
    StartCallback<TBStartResponse> startCallback;
    AnswerCallback<TBAnswerResponse> answerCallback;
    String userId;
    String topicId;
    String opponentId;
    QuizGameIo gameIo;

    public TurnBaseQuizGameBuilder(TurnBaseQuizGameBuilder builder) {
        this.createCallback = builder.createCallback;
        this.startCallback = builder.startCallback;
        this.answerCallback = builder.answerCallback;
        this.userId = builder.userId;
        this.topicId = builder.topicId;
        this.opponentId = builder.opponentId;
        this.gameIo = builder.gameIo;
    }

    public TurnBaseQuizGameBuilder() {
    }

    public TurnBaseQuizGameBuilder io(QuizGameIo io) {
        this.gameIo = io;
        return this;
    }

    public TurnBaseQuizGameBuilder userId(String userId) {
        this.userId = userId;
        return this;
    }

    public TurnBaseQuizGameBuilder topicId(String topicId) {
        this.topicId = topicId;
        return this;
    }

    public TurnBaseQuizGameBuilder opponentId(String opponentId) {
        this.opponentId = opponentId;
        return this;
    }

    public TurnBaseQuizGameBuilder createCallback(CreateCallback<TBCreateResponse> callback) {
        this.createCallback = callback;
        return this;
    }

    public TurnBaseQuizGameBuilder startCallback(StartCallback<TBStartResponse> callback) {
        this.startCallback = callback;
        return this;
    }

    public TurnBaseQuizGameBuilder answerCallback(AnswerCallback<TBAnswerResponse> callback) {
        this.answerCallback = callback;
        return this;
    }

    public TurnBasedTopicQuizGame build() {
        return new TurnBasedTopicQuizGame(this);
    }
}
