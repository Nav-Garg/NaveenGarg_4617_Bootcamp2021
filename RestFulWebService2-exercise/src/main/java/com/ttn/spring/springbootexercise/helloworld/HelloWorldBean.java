package com.ttn.spring.springbootexercise.helloworld;

public class HelloWorldBean {
    private String msg;

    public HelloWorldBean(String msg) {
        this.msg = msg;
    }

    public void setS(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" + "msg='" + msg + '\'' + '}';
    }

    public String getMsg() {
        return msg;
    }
}
