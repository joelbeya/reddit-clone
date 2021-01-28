package com.redditclone.backend.exception;

public class SpringRedditException extends RuntimeException {

    public SpringRedditException(String vote_not_found) {
        super(vote_not_found);
    }

    public SpringRedditException(String vote_not_found, Exception exception) {
        super(vote_not_found);
    }
}
