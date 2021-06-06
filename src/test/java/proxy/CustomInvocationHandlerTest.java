package proxy;

import models.IFigure;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import models.Tetragon;

import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomInvocationHandlerTest {

    @Test
    @DisplayName("Test for not allowing run setters with reflection")
    void invoke() {
        IFigure figure;
        figure = new Tetragon(1,2,3,4);
        CustomInvocationHandler invocationHandler = new CustomInvocationHandler(figure);
        Tetragon f = (Tetragon) Proxy.newProxyInstance(Tetragon.class.getClassLoader(),
                new Class[] { Tetragon.class },
                invocationHandler);

        assertEquals(1, f.getSide1());
        Assertions.assertThrows(UndeclaredThrowableException.class, () -> {
            f.setSide1(6);
        });
    }
}