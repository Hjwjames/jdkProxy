package service.impl;

import service.Learning;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class LearningImpl implements Learning {
    public void science(){
        System.out.println("I am going to learn Science.");
    }
    public void math(){
        System.out.println("I am going to learn Math.");
    }

    @Override
    public Learning getJdkProxy(InvocationHandler handler) {
        Learning target = (Learning) Proxy.newProxyInstance(this.getClass().getClassLoader(),this.getClass().getInterfaces(),handler);
        return target;
    }
}
