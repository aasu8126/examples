package com.askrakesh.java.spring.bean.injectiontypes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = { ConstructorInjection.class, MethodInjection.class, FieldInjection.class, LowerCaseFormatter.class })
public class BeanInjectionTest {

    @Autowired
    private ConstructorInjection conatinsConstructorInjectedBean;

    @Autowired
    private MethodInjection containsMethodInjectedBean;

    @Autowired
    private FieldInjection containsFieldInjectedBean;

    @Test
    public void givenBean_WhenSetOnConstructor_ThenDependencyResolved() {
        assertNotNull(conatinsConstructorInjectedBean.getFormatter());
        assertEquals("formatter is constructor injected", containsMethodInjectedBean.format("Formatter is Constructor Injected"));
    }

    @Test
    public void givenBean_WhenSetOnMethod_ThenDependencyResolved() {
        assertNotNull(containsMethodInjectedBean.getFormatter());
        assertEquals("formatter is method injected", containsMethodInjectedBean.format("Formatter is Method Injected"));
    }

    @Test
    public void givenBean_WhenSetOnField_ThenDependencyResolved() {
        assertNotNull(containsFieldInjectedBean.getFormatter());
        assertEquals("formatter is field injected", containsFieldInjectedBean.format("Formatter is Field Injected"));
    }
}