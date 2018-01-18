package com.askrakesh.java.spring.bean.injectiontypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class MethodInjection {
	@Getter
	Formatter formatter;

	@Autowired
	public void setMethodForTextFormatter(Formatter formatter) {
		this.formatter = formatter;
	}

	public String format(String text) {
		return formatter.format(text);
	}
}