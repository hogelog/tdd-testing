package org.hogel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testSum() {
		Calc calc = new Calc();
		
		assertThat(calc.sum(3, 8), is(11));
	
		assertThat(calc.sum(3, 8), is(-5));
	}

}
