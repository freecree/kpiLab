package proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import models.IFigure;
import models.Tetragon;

import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

import static org.junit.jupiter.api.Assertions.*;

class CustomInvocationHandlerTest {

    @Test
    @DisplayName("Test for not allowing run setters with reflection")
    void invoke() {
        Tetragon figure = new Tetragon(1,2,3,4);
        CustomInvocationHandler invocationHandler = new CustomInvocationHandler(figure);
        IFigure f = (IFigure) Proxy.newProxyInstance(IFigure.class.getClassLoader(),
                new Class[] { IFigure.class },
                invocationHandler);

        assertEquals(1, f.getSide1());
        Assertions.assertThrows(UndeclaredThrowableException.class, () -> {
            f.setSide1(6);
        });
    }
}