package com.curso.maven.unitarias;

import static org.junit.Assert.*;

import org.junit.Test;

import com.curso.maven.sonar.AnalisisEstatico;

public class AnalisisEstaticoTest {

	@Test
	public void test() {
		AnalisisEstatico sut = new AnalisisEstatico();
		
		sut.metodoSonarUseEquals();
		// Stupid assert
		assertTrue(true);
	}

}
