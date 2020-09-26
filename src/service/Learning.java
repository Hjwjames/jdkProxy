package service;

import java.lang.reflect.InvocationHandler;

public interface Learning {
    public void science();
    public void math();
    public Learning getJdkProxy(InvocationHandler handler);
}
