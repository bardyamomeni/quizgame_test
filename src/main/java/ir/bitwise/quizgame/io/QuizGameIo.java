package ir.bitwise.quizgame.io;

import ir.bitwise.quizgame.model.KeyValueBundle;

/**
 * Created by Bardya on 5/5/2016.
 */
public abstract class QuizGameIo<C, S, A> {

    QuizGameIoListener<C, S, A> ioListener;
    Parser<C, S, A> parser;

    public QuizGameIoListener<C, S, A> getIoListener() {
        return ioListener;
    }

    public void setIoListener(QuizGameIoListener<C, S, A> ioListener) {
        this.ioListener = ioListener;
    }

    public Parser<C, S, A> getParser() {
        return parser;
    }

    public void setParser(Parser<C, S, A> parser) {
        this.parser = parser;
    }

    public void createRequest(KeyValueBundle bundle) {
        ioListener.onCreateResponse(parser.parseCreateResponse(createRequestImpl(bundle)));
    }

    public void startRequest(KeyValueBundle bundle) {
        ioListener.onStartResponse(parser.parseStartResponse(startRequestImpl(bundle)));
    }

    public void answerRequest(KeyValueBundle bundle) {
        ioListener.onAnswerResponse(parser.parseAnswerResponse(answerRequestImpl(bundle)));
    }

    protected abstract String createRequestImpl(KeyValueBundle bundle);

    protected abstract String startRequestImpl(KeyValueBundle bundle);

    protected abstract String answerRequestImpl(KeyValueBundle bundle);
}
