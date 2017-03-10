package com.yyyu.thread.product_consumer;

/**
 * Apple封装bean
 */
public class Apple {

    private int id;

    public Apple(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "苹果"+id;
    }
}
