package com.xen.typeinference;

/**
 * Created by psinha on 3/23/17.
 */
public class TypeInference {

    public static void main (String args[]){
        print((a, b) -> a.concat(b));
    }

    static void print(Concatenate concatenate){
        String a = "Hello ";
        String b = "World";
        System.out.print(concatenate.concat( a,  b));
    }

}

interface Concatenate {
    String concat(String a, String b);
}

