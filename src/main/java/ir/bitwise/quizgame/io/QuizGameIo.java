package ir.bitwise.quizgame.io;

import ir.bitwise.quizgame.io.parser.Parser;
import ir.bitwise.quizgame.model.KeyValueBundle;

/**
 * Created by Bardya on 5/5/2016.
 */
public abstract class QuizGameIo {

    public <T> void createRequest(KeyValueBundle bundle, final Parser<T> parser, final ParseListener<T> parseListener) {
        createRequestImpl(bundle, new ResponseListener() {
            @Override
            public void onIoResponse(String jsonResponse) {
                parser.parseData(jsonResponse,parseListener);
            }

            @Override
            public void onIoError(Throwable e) {
                parseListener.onIoError(e);
            }
        });
    }

    public void startRequest(KeyValueBundle bundle,ResponseListener responseListener) {
        startRequestImpl(bundle,responseListener);
    }

    public void answerRequest(KeyValueBundle bundle,ResponseListener responseListener) {
        answerRequestImpl(bundle,responseListener);
    }

    protected abstract void createRequestImpl(KeyValueBundle bundle,ResponseListener responseListener);

    protected abstract void startRequestImpl(KeyValueBundle bundle,ResponseListener responseListener);

    protected abstract void answerRequestImpl(KeyValueBundle bundle,ResponseListener responseListener);
}
