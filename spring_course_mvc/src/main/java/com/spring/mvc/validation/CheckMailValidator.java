package com.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CheckMailValidator implements ConstraintValidator<CheckMail, String> {

    private String endOfMail;


    @Override
    public void initialize(CheckMail checkMail) {
        endOfMail = checkMail.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {

        return enteredValue.endsWith(endOfMail);
    }
}
