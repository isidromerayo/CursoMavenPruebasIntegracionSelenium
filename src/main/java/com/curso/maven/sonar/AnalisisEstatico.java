/**
 * 
 */
package com.curso.maven.sonar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author dtvaaula
 *
 */
public class AnalisisEstatico {

	/**
	 * "Calendars" and "DateFormats" should not be static
	 */
	private SimpleDateFormat format = new SimpleDateFormat("HH-mm-ss");
	private Calendar calendar = Calendar.getInstance();

	/**
	 * ".equals()" should not be used to test the values of "Atomic" classes
	 */
	public void metodoSonarUseEquals() {
		AtomicInteger aInt1 = new AtomicInteger(0);
		AtomicInteger aInt2 = new AtomicInteger(0);

		if (aInt1.get() == aInt2.get()) {

		}
	}
	
}
