package com.yyyu.thread.product_consumer;

/**
 * 测试
 */
public class Client {

    public static void main(String[] args){

        AppleSpan appleSpan = new AppleSpan();
        Consumer consumer = new Consumer(appleSpan);
        Producer producer = new Producer(appleSpan);
        producer.productApple();
        consumer.consumeApple();
        //consumer.consumeApple();

    }

}
