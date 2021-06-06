package proxy;

import models.Figure;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {

    private Figure original;
    public CustomInvocationHandler(Figure original) {
        this.original = original;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //System.out.println("In CustomInvocationHandler");
        if( method.getName().startsWith("set") ){
            throw new IllegalAccessException("Setters not allowed");
        }
        return method.invoke(original, args);
    }
}
