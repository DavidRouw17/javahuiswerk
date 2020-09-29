package LabsEnHwOpdrachten.lab12;

import LabsEnHwOpdrachten.hw10.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectionAffection {

    public static void main(String[] args) {
        Class<Person> personClass = Person.class;

        Annotation[] annotations = personClass.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.toString());
        }

        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.toString());
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                System.out.println(declaredAnnotation.annotationType().toGenericString());
                System.out.println(declaredAnnotation.toString());
            }
        }
    }
}
