package com.yyyu.generics;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/8/8.
 */
public class Generic<T> implements IGeneric<User>{


    /**
     * 泛型类中定义泛型方法
     * @param e
     * @param <E>
     */
    public<E> void findByE(E e){

    }

    @Override
    public User getType() {
        return null;
    }
}
