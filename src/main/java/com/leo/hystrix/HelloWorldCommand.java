package com.leo.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * @auther leo
 * @date 2014-12-05.
 */
public class HelloWorldCommand extends HystrixCommand<String> {

    String name;

    public HelloWorldCommand() {
        super(HystrixCommandGroupKey.Factory.asKey("MyGroup"));
    }

    public HelloWorldCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.name = name;
    }

    @Override
    protected String run() {
        try {
            Thread.sleep(1000 * 2);
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
