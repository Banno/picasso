package com.squareup.picasso.result;

import com.squareup.picasso.Downloader.ResponseException;

public class HttpFailure extends Failure {

    private int responseCode;
    private ResponseException cause;

    public HttpFailure(int responseCode, ResponseException cause) {
        this.responseCode = responseCode;
        this.cause = cause;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    public int getResponseCode() {
        return responseCode;
    }

    @Override
    public ResponseException getCause() {
        return cause;
    }
}
