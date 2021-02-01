package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {

    Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    /*
    核心方法
    */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("进入代理类");

        if(method.getName().endsWith("sing")) {
            // 进入核心类
            method.invoke(realStar, args);
        }
        return null;
    }
}
