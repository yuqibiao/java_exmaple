package com.yyyu.thread.product_consumer;

/**
 * 消费者
 */
public class Consumer {

    private AppleSpan mSpan;

    public Consumer(AppleSpan sapn){
        this.mSpan = sapn;
    }

    public void consumeApple(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1500);
                        mSpan.getApple();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }

}
