package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@BadCode(name = "Daniil", comment = "1st Anotation")
public class BadClass {
    int num;
    @BadCode(name = "Daniil", comment = "2nd Anotation")
    private String str;
    @BadCode(name = "Daniil", comment = "3rd Anotation")
    public void print() {
        System.out.println(str + num);
    }

    public static void main(String[] args) {
        BadClass badClass = new BadClass();

        Class aClass = badClass.getClass();
        if (aClass.isAnnotationPresent(BadCode.class)) {
            System.out.println(aClass.getName());
            BadCode annotation = (BadCode) aClass.getAnnotation(BadCode.class);
            System.out.println("Name: " + annotation.name());
            System.out.println("Comment: " + annotation.comment());

        }

        Field[] declaredFields = badClass.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(BadCode.class)) {
                System.out.println(field.getName());
                System.out.println(field.getAnnotation(BadCode.class).name());
                System.out.println(field.getAnnotation(BadCode.class).comment());
            }
        }

        Method [] declaredMethods = badClass.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(BadCode.class)) {
                System.out.println(method.getName());
                System.out.println(method.getAnnotation(BadCode.class).name());
                System.out.println(method.getAnnotation(BadCode.class).comment());
            }
        }
    }
}
