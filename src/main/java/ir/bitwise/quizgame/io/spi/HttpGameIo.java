package ir.bitwise.quizgame.io.spi;

import ir.bitwise.quizgame.io.QuizGameIo;
import ir.bitwise.quizgame.io.ResponseListener;
import ir.bitwise.quizgame.model.KeyValueBundle;
import okhttp3.OkHttpClient;

/**
 * Created by Bardya on 5/6/2016.
 */
public class HttpGameIo extends QuizGameIo {

    private OkHttpClient httpClient;

    public HttpGameIo() {
        httpClient = new OkHttpClient.Builder().build();
    }


    @Override
    protected void createRequestImpl(KeyValueBundle bundle, ResponseListener responseListener) {
            responseListener.onIoResponse("Some JSON");
    }

    @Override
    protected void startRequestImpl(KeyValueBundle bundle, ResponseListener responseListener) {
        responseListener.onIoResponse("Some JSON");
    }

    @Override
    protected void answerRequestImpl(KeyValueBundle bundle, ResponseListener responseListener) {
        responseListener.onIoResponse("Some JSON");
    }
}
