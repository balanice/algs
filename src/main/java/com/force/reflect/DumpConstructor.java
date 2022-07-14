package com.force.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class DumpConstructor {
    private int a;
    private String s;

    public DumpConstructor(int a, String s) {
        this.a = a;
        this.s = s;
    }

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.force.reflect.DumpConstructor");
            Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
            for (int i = 0; i < declaredConstructors.length; i++) {
                Constructor<?> constructor = declaredConstructors[i];
                String name = constructor.getName();
                System.out.println("Name: " + name);
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                for (int j = 0; j < parameterTypes.length; j++) {
                    System.out.println("param #" + j + " " + parameterTypes[j]);
                }
            }
            var declaredFields = c.getDeclaredFields();
            for (int i = 0; i < declaredFields.length; i++) {
                Field field = declaredFields[i];
                int modifiers = field.getModifiers();
                System.out.println(field.getName());
                System.out.println(Modifier.toString(modifiers));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
