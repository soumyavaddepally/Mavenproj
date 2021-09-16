package com.jenktest;
import com.jenk.MyCalculator;
import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalculatorTest {
	@Test
	public void test1() {
		assertEquals(10,new MyCalculator().getSum(5, 5));
	}
	@Test
	public void test2() {
		assertEquals(12,new MyCalculator().getSum(6,6));
	}
	@Test
	public void test3() {
		assertEquals(0,new MyCalculator().getSum(0, 0));
	}
	@Test
	public void test4() {
		assertEquals(20,new MyCalculator().getSum(15, 5));
	}
}
