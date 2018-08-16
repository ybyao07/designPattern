package com.learn.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLibDynamicProxy implements MethodInterceptor {

	private static CGLibDynamicProxy instance = new CGLibDynamicProxy();
	public CGLibDynamicProxy() {
		// TODO Auto-generated constructor stub
	}
	
	public static CGLibDynamicProxy getInstance() {
		return instance;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getProxy(Class<T> cls){
		return (T)Enhancer.create(cls, this);
	}
	public Object intercept(Object targer, Method method, Object[] arg2, MethodProxy proxy) throws Throwable {
		// TODO Auto-generated method stub
		before();
		Object result = proxy.invokeSuper(targer, arg2);
		after();
		return result;
	}

	private void before() {
		System.out.println("Before");
	}
	private void after() {
		System.out.println("After");
	}
	
	public static void main(String[] args) {
		Greeting greeting = CGLibDynamicProxy.getInstance().getProxy(GreetingImpl.class);
		greeting.sayHello("Jack");
	}
	
}
