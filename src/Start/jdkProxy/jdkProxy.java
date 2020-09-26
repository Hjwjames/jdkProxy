package Start.jdkProxy;

import Start.others.LearningHandler;
import service.Learning;
import service.impl.LearningImpl;

import java.lang.reflect.Proxy;

public class jdkProxy {
    public static void main(String[] args){
        Learning target = new LearningImpl();
        LearningHandler handler = new LearningHandler(target);

        //Learning proxy = (Learning)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),handler);

        Learning proxy = target.getJdkProxy(handler);
        proxy.math();
        System.out.println("--------------------------------");
        proxy.science();

    }
}
