package com.alibaba;

import com.alibaba.dubbo.common.utils.ConcurrentHashSet;

import java.util.Set;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2018/9/12
 */
public class SaoCaoZuoDemo {

    private static Set<Class<?>> cachedWrapperClasses ;

    public static void saocaozuo(){
        Set<Class<?>> wrappers = cachedWrapperClasses;
        if (wrappers == null) {
            cachedWrapperClasses = new ConcurrentHashSet<Class<?>>();
            wrappers = cachedWrapperClasses;
        }
        //添加到 wrappers 中
        wrappers.add(SaoCaoZuoDemo.class);
    }
    public static void main(String[] args) {

        saocaozuo() ;

        System.out.println(cachedWrapperClasses.size());

    }
}
