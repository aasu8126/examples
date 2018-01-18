package com.askrakesh.java.spring.bean.injectiontypes;

public class LowerCaseFormatter implements Formatter{
    public String format(String text) {
        return text.toLowerCase();
    }
}
