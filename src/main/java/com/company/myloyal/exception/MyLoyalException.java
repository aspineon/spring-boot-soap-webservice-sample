package com.company.myloyal.exception;

/**
 * Created by jmbataller on 07/12/14.
 */
public class MyLoyalException extends Exception {

    private String code;

    public MyLoyalException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
