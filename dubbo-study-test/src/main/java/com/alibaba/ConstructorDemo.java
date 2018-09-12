package com.alibaba;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2018/9/12
 */
public class ConstructorDemo {

    public static void main(String[] args) {
        NongFu nongfu = new NongFu() ;
        try {
            NongFu.class.getConstructor(MokeSPI.class) ;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
