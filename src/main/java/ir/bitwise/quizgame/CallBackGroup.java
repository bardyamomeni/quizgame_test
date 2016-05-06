package ir.bitwise.quizgame;

import ir.bitwise.quizgame.callbacks.AnswerCallback;
import ir.bitwise.quizgame.callbacks.CreateCallback;
import ir.bitwise.quizgame.callbacks.StartCallback;

/**
 * Created by Bardya on 5/6/2016.
 */
public class CallBackGroup<C, S, A> {

    private CreateCallback<C> createCallback;
    private StartCallback<S> startCallback;
    private AnswerCallback<A> answerCallback;

    public CallBackGroup(CreateCallback<C> createCallback, StartCallback<S> startCallback, AnswerCallback<A> answerCallback) {
        this.createCallback = createCallback;
        this.startCallback = startCallback;
        this.answerCallback = answerCallback;
    }

    public CreateCallback<C> getCreateCallback() {
        return createCallback;
    }

    public StartCallback<S> getStartCallback() {
        return startCallback;
    }

    public AnswerCallback<A> getAnswerCallback() {
        return answerCallback;
    }
}
