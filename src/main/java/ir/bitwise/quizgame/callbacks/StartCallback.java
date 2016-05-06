package ir.bitwise.quizgame.callbacks;

/**
 * Created by Bardya on 5/5/2016.
 */
public interface StartCallback<T> {

    void onStarted(T startResponse);

    void onStartFailed();
}
