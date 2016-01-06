package com.squareup.picasso.result;

public class GenericFailure extends Failure {

    private Exception cause;

    public GenericFailure(Exception cause) {
        this.cause = cause;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public Exception getCause() {
        return cause;
    }
}
