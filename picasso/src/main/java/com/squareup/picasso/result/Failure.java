package com.squareup.picasso.result;

public abstract class Failure {

    public abstract <T> T accept(Visitor<T> visitor);

    public abstract Throwable getCause();

    public interface Visitor<T> {
        T visit(HttpFailure httpFailure);

        T visit(GenericFailure genericFailure);
    }
}
