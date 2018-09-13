package com.alibaba;

/**
 * Hello world!
 */
public class AnnotationDemo {


    public static void main(String[] args) {
        MokeSPI annotation = User.class.getAnnotation(MokeSPI.class);
        System.out.println(annotation.value());

        System.out.println(NongFu.class.isAnnotationPresent(MokeSPI.class));
    }


}
