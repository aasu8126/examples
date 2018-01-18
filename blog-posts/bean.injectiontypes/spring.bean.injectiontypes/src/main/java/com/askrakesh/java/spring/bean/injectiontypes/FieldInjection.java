package com.askrakesh.java.spring.bean.injectiontypes;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;

public class FieldInjection {

    @Autowired
    @Getter
    private Formatter formatter;

    public String format(String text) {
        return formatter.format(text);
    }
}
