package com.company.myloyal.exception;

/**
 * Created by jmbataller on 07/12/14.
 */
public class NotFoundException extends MyLoyalException {

    public NotFoundException(String code, String message) {
        super(code, message);
    }
}
