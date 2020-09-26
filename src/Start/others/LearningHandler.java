package Start.others;

import service.MyAdvise;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 接口实现横切
 */
public class LearningHandler implements InvocationHandler {
    //代理对象
    private Object target;

    public LearningHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAdvise.before();
        System.out.println("Start jdk Proxy!");
        Object obj = method.invoke(target,args);
        MyAdvise.after();
        return obj;
    }
}
