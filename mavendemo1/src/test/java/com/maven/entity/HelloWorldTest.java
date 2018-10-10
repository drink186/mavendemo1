package com.maven.entity;

import org.junit.Test;

public class HelloWorldTest {
	@Test
	public void test1() {
		HelloWorld hello=new HelloWorld();
		hello.say();
	}
	@Test
	public void test2() {
		HelloWorld hello=new HelloWorld();
		System.out.println(hello.print());
	}
}
