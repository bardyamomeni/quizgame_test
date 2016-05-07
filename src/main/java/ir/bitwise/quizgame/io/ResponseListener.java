package ir.bitwise.quizgame.io;

/**
 * =============================== <br></br>
 * Created by b.momeni on 5/7/2016.
 * Email: b.momeni@tgbs.ir
 */
public interface ResponseListener {

    void onIoResponse(String jsonResponse);

    void onIoError(Throwable e);
}
