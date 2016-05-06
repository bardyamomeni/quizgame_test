package ir.bitwise.quizgame.io.spi;

import ir.bitwise.quizgame.io.QuizGameIo;
import okhttp3.OkHttpClient;

/**
 * Created by Bardya on 5/6/2016.
 */
public abstract class HttpGameIo<C, S, A> extends QuizGameIo<C, S, A> {

    private OkHttpClient httpClient;

    public HttpGameIo() {
        httpClient = new OkHttpClient.Builder().build();
    }

    public OkHttpClient getHttpClient() {
        return httpClient;
    }

}
