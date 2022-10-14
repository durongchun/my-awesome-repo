package com.holinova.exception;

/**
 * @author Lucy
 * @version 1.0.0
 * @date 2022/10/20
 */
public class BrowserNameException extends RuntimeException {
    public BrowserNameException() {
        super();
    }

    public BrowserNameException(String s) {
        super(s);
    }
}
