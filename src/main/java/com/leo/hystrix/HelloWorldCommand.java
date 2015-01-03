package com.leo.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * @auther leo
 * @date 2014-12-05.
 */
public class HelloWorldCommand extends HystrixCommand {

    public HelloWorldCommand() {
        super(HystrixCommandGroupKey.Factory.asKey("MyGroup"));
    }

    @Override
    protected String run() {
        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello World";
    }

    @Override
    protected String getFallback() {
        return "Hello Fallback";
    }
}
