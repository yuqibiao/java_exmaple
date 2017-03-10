package com.yyyu.thread.product_consumer;

/**
 * 放苹果的盘子
 */
public class AppleSpan {

    //---盘子的容量
    public static final int spanCap = 10;
    //---放苹果的盘子
    public Apple[] span = new Apple[spanCap];
    //---记录当前盘子的位置
    public int index = 0;

    public synchronized void putApple(Apple apple){
        while(index >= spanCap){
            try {
                wait();
                System.out.println("盘子已经====满了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("生产了一个苹果"+index);
        span[index] = apple;
        index++;
        notify();
    }

    public synchronized void getApple(){

        while (index<=0){
            try {
                System.out.println("盘子已经====空了");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费了一个苹果"+index);
        span[index-1] = null;
        index--;
        notify();
    }


}
