package com.askrakesh.java.spring.bean.injectiontypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class ConstructorInjection {
    @Getter
    private Formatter formatter;

    @Autowired
    public ConstructorInjection(Formatter formatter) {
        this.formatter = formatter;
    }

    public String format(String text) {
        return formatter.format(text);
    }
}
