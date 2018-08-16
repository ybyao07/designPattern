package com.learn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy implements InvocationHandler {

	private Object target;
	public JDKDynamicProxy(Object target) {
		// TODO Auto-generated constructor stub
		this.target = target;
	}

	@SuppressWarnings("unchecked")
	public <T> T getProxy() {
		return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		before();
		Object result = method.invoke(target, args);
		after();
		return result;
	}

	
	private void before(){
		System.out.println("Before");
	}
	private void after(){
		System.out.println("After");
	}
	
	public static void main(String[] args) {
		Greeting greeting = new JDKDynamicProxy(new GreetingImpl()).getProxy();
		greeting.sayHello("Jack");
	}
}
