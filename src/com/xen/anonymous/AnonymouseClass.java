package com.xen.anonymous;

/**
 * Created by psinha on 3/23/17.
 */
public class AnonymouseClass {

    public void method()
    {

    }

    public static void main (String args[]){
        AnonymousInterface anonymousInterface = new AnonymousInterface() {
            @Override public void start() {
                System.out.println("Hello World");
            }
        };

        anonymousInterface.start();
    }

}
