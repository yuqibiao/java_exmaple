package com.yyyu.thread.product_consumer;

/**
 * 生产者
 */
public class Producer {

    private AppleSpan mSpan ;

    public Producer(AppleSpan sapn){
        this.mSpan = sapn;
    }

    public void productApple(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(true){
                    try {
                        Thread.sleep(1000);
                        mSpan.putApple( new Apple(i));
                        i++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}
