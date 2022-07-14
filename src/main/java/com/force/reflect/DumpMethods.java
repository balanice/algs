package com.force.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DumpMethods {
    private static Method[] declaredMethods;

    public static void main(String[] args) {
        try {
            Class c = Class.forName("java.util.Stack");
            declaredMethods = c.getDeclaredMethods();
            for (int i = 0; i < declaredMethods.length; i++) {
                System.out.println(declaredMethods[i].toString());
            }
            Field[] declaredFields = c.getDeclaredFields();
            System.out.println("Field");
            for (int i = 0; i < declaredFields.length; i++) {
                System.out.println(declaredFields[i]);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
