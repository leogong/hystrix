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
        return "Hello World";
    }

    @Override
    protected String getFallback() {
        return "Hello Fallback";
    }
}
