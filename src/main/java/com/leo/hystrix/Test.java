package com.leo.hystrix;

import rx.Observable;
import rx.Observer;
import rx.util.functions.Action1;

import java.util.concurrent.ExecutionException;

/**
 * @auther leo
 * @date 2014-12-05.
 */
public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // String s = (String) new HelloWorldCommand().execute();
        // System.out.println(s);
        // java.util.concurrent.Future future = new HelloWorldCommand().queue();
        // System.out.println(future.get());
        Observable<String> fs = new HelloWorldCommand("World").observe();
        fs.subscribe(new Observer<String>() {

            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
                // nothing needed here
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError");
                e.printStackTrace();
            }

            @Override
            public void onNext(String v) {
                System.out.println("onNext: " + v);
            }

        });
    }
}
