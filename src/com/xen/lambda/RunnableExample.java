package com.xen.lambda;

/**
 * Created by psinha on 3/23/17.
 */
public class RunnableExample {

    public static void main(String args[]){

        Thread thread = new Thread(new Runnable() {
            @Override public void run() {
                System.out.println("Inside runnable");
            }
        });
        thread.run();

        Thread thread2 = new Thread(() -> System.out.print("Inside Lambda runnable"));
        thread2.run();
    }
}
