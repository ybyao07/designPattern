package com.learn.proxy;

public class GreetingProxy implements Greeting {

	private GreetingImpl greetingImpl;
	
	public GreetingProxy(GreetingImpl greetingImpl) {
		// TODO Auto-generated constructor stub
		this.greetingImpl = greetingImpl;
	}
	
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		before();
		greetingImpl.sayHello(name);
		after();
	}
	private void before(){
		System.out.println("Before");
	}

	private void after(){
		System.out.println("After");
	}
}
