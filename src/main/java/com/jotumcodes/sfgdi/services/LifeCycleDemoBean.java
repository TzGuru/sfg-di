package com.jotumcodes.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Emmanuel Jonas on 25/05/2021
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    /**
     * Executed in sequence
     */

    public LifeCycleDemoBean() {
        System.out.println("### I'm in a LifeCycleBean Constructor");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("### My Bean Name is : "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("### Bean Factory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("### Application context has been set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("### The postConstruct annotated method has been called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("### The LifeCycleBean has its properties set");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("### The preDestroy annotated method has been called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("### The LifeCycle has been terminated");
    }

    public void beforeInit() {
        System.out.println("### The LifeCycle beforeInit called");
    }

    public void afterInit() {
        System.out.println("### The LifeCycle afterInit called");
    }
}
