package com.curso.maven.unitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class DummyTest {

	@Test
	public void test() {
		// fail("Not yet implemented");
	}
	
	@Test
	public final void dummy() {
		String hello = new com.curso.maven.Dummy().sayHello();
		assertEquals("Hello World...", hello);
	}

}
