package org.springframework.beans.factory;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessorBeforeInitialization(Object bean, String beanName) {
        System.out.println("--- CustomPostProcessor - Before " + beanName);
        return bean;
    }

    @Override
    public Object postProcessorAfterInitialization(Object bean, String beanName) {
        System.out.println("--- CustomPostProcessor - After " + beanName);
        return bean;
    }
}
