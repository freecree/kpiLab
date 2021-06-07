import config.SpringConfig;
import controllers.FigureController;
import models.FigureAnnotation;
import models.Tetragon;
import models.Triangle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) {
        Tetragon tetragon = new Tetragon(5, 4, 3, 2);
        //System.out.println(tetragon.getSide1());
        System.out.println("Методы с аннотациями: ");
        for (Method m : tetragon.getClass().getDeclaredMethods()) {
            m.setAccessible(true);
            //System.out.println(m);
            if (m.isAnnotationPresent(FigureAnnotation.class)) {
                try {
                    m.invoke(tetragon);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(tetragon.getClass().getName());
        Field[] fields = tetragon.getClass().getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            int fieldMod = field.getModifiers();
            System.out.println("Field: ");
            System.out.println("Name: "+ field.getName());
            System.out.println("Type: "+ fieldType.getName());
            System.out.println("Modifier: "+ fieldMod);
//            if (Modifier.isPrivate(fieldMod)) {
//                System.out.println("public");
//            }
        }

        System.out.println("Аннотации класса: ");
        Annotation [] annotations = tetragon.getClass().getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        System.out.println("Proxy:");
//        Tetragon figure = new Tetragon(1,2,3,4);
//        CustomInvocationHandler invocationHandler = new CustomInvocationHandler(figure);
//        Tetragon f = (Tetragon) Proxy.newProxyInstance(Tetragon.class.getClassLoader(),
//            new Class[] { Tetragon.class },
//            invocationHandler);
//        f.square();
//        f.getSide1();
        //f.setSide1(6);

//        Tetragon tetragon1 = new Tetragon.Builder()
//                .setSide1(2)
//                .setSide2(3)
//                .setSide3(4)
//                .setSide4(5)
//                .build();
//        System.out.println("Sides: ");
//        System.out.println(tetragon1.getSide1());
//        System.out.println(tetragon1.getSide2());
//        System.out.println(tetragon1.getSide3());
//        System.out.println(tetragon1.getSide4());
//        Triangle triangle = new Triangle(3, 4, 5);
//        Triangle triangle1 = triangle.clone();
//        System.out.println("Треугольник: ");
//        System.out.println(triangle);
//        System.out.println("Копия треугольника: ");
//        System.out.println(triangle1);
//
//        FigureController figureController = new FigureController();
//        figureController.triangleIn();
//        figureController.triangleOut();
//        figureController.triangleSquareOut();
//
//        figureController.tetragonIn();
//        figureController.tetragonOut();
//        figureController.tetragonSquareOut();
//        System.out.println("Main figure: ");
//        figureController.figureOut();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        FigureController figureController2 = context.getBean("figureController", FigureController.class);
        figureController2.triangleIn();
        figureController2.triangleOut();

    }

}
