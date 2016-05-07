package ir.bitwise.quizgame.spi.topic.spi.turnbased;


import ir.bitwise.quizgame.callbacks.AnswerCallback;
import ir.bitwise.quizgame.callbacks.CreateCallback;
import ir.bitwise.quizgame.callbacks.StartCallback;
import ir.bitwise.quizgame.io.ParseListener;
import ir.bitwise.quizgame.io.parser.Parser;
import ir.bitwise.quizgame.model.Answer;
import ir.bitwise.quizgame.spi.topic.TopicQuizGame;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBAnswerResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBCreateResponse;
import ir.bitwise.quizgame.spi.topic.spi.turnbased.model.TBStartResponse;

/**
 * Created by Bardya on 5/6/2016.
 */
public class TurnBasedTopicQuizGame extends TopicQuizGame  {

    private final TurnBaseQuizGameBuilder builder;
    String opponentId;

    protected TurnBasedTopicQuizGame(TurnBaseQuizGameBuilder builder) {
        super(builder.gameIo, builder.userId, builder.topicId);
        setCreateCallback(builder.createCallback);
        setStartCallback(builder.startCallback);
        setAnswerCallback(builder.answerCallback);
        this.opponentId = builder.opponentId;
        this.builder = builder;
    }

    @Override
    public <T> void create(final CreateCallback<T> callback) {
        getQuizGameIo().createRequest(null, new CreateResponseParser(), new ParseListener<TBCreateResponse>() {
            @SuppressWarnings("unchecked")
            @Override
            public void onParsedData(TBCreateResponse parsedObject) {
                callback.onCreated((T) parsedObject);
            }

            @Override
            public void onParsingError(Throwable error) {

            }

            @Override
            public void onIoError(Throwable error) {

            }
        });
    }

    @Override
    public <T> void start(StartCallback<T> startCallback) {

    }

    @Override
    public <T> void answer(Answer answer, AnswerCallback<T> answerCallback) {

    }

    public void skip() {

    }

    public void cancel() {

    }

    public TurnBaseQuizGameBuilder newBuilder() {
        return new TurnBaseQuizGameBuilder(builder);
    }

    private class CreateResponseParser extends Parser<TBCreateResponse> {

        @Override
        public void parseData(String input, ParseListener<TBCreateResponse> parseListener) {
            parseListener.onParsedData(new TBCreateResponse());
        }
    }

    private class StartResponseParser extends Parser<TBStartResponse>{

        @Override
        public void parseData(String input, ParseListener<TBStartResponse> parseListener) {
            parseListener.onParsedData(new TBStartResponse());
        }
    }

    private class AnswerResponseParser extends Parser<TBAnswerResponse>{

        @Override
        public void parseData(String input, ParseListener<TBAnswerResponse> parseListener) {
            parseListener.onParsedData(new TBAnswerResponse());
        }
    }
}
