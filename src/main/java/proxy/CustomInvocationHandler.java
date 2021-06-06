package proxy;

import models.IFigure;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {

    private IFigure original;
    public CustomInvocationHandler(IFigure original) {
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
