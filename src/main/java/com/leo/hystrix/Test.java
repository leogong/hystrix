package com.leo.hystrix;

import java.util.concurrent.ExecutionException;

/**
 * @auther leo
 * @date 2014-12-05.
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        String s = (String) new HelloWorldCommand().execute();
//        System.out.println(s);
        java.util.concurrent.Future future = new HelloWorldCommand().queue();
        System.out.println(future.get());
    }
}
