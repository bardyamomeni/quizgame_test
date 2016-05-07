package ir.bitwise.quizgame.io;

/**
 * =============================== <br></br>
 * Created by b.momeni on 5/7/2016.
 * Email: b.momeni@tgbs.ir
 */
public interface ParseListener<T> {

    void onParsedData(T parsedObject);

    void onParsingError(Throwable error);

    void onIoError(Throwable error);

}
