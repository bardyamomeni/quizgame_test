package ir.bitwise.quizgame.callbacks;

/**
 * Created by Bardya on 5/5/2016.
 */
public interface CreateCallback<T> {
    void onCreated(T t);
    void onCreateFailed();
}
