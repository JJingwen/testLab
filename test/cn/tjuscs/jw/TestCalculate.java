package cn.tjuscs.jw;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculate {
	
	Calculate cal;
	//cal = new Calculate();
	public TestCalculate(){
		cal = new Calculate();
	}
	
	//测试用例不是三角形
	@Test
	public void test10() {
		
		System.out.println("Test10:");
		int res = (int) cal.justify(1, 2, 1);
		assertEquals(-1, res, 0);
		
	}
	
	//测试用例不是三角形
	@Test
	public void test11() {
		System.out.println(" ");
		System.out.println("Test11:");
		int res = (int) cal.justify(1, 2, 3);
		assertEquals(-1, res, 0);
	}
	
	//测试用例不是三角形
	@Test
	public void test12() {
		System.out.println(" ");
		System.out.println("Test12:");
		int res = (int) cal.justify(0, 1, 1);
		assertEquals(-1, res, 0);
	}
	
	//测试用例不是三角形
	@Test
	public void test13() {
		System.out.println(" ");
		System.out.println("Test13:");
		int res = (int) cal.justify(0, 0, 0);
		assertEquals(-1, res, 0);
	}
	
	//测试时等边三角形
	@Test
	public void test20() {
		System.out.println(" ");
		System.out.println("Test20:");
		int res = (int) cal.justify(2, 2, 2);
		assertEquals(1, res, 0);
	}
	
	//测试时等边三角形
	@Test
	public void test21() {
		System.out.println(" ");
		System.out.println("Test21:");
		int res = (int) cal.justify(6, 6, 6);
		assertEquals(1, res, 0);
	}
	
	
	//测试时等腰三角形
	@Test
	public void test30() {
		System.out.println(" ");
		System.out.println("Test30:");
	    int res = (int) cal.justify(2, 1, 2);
		assertEquals(2, res, 0);
	}
	
	//测试时等腰三角形
		@Test
		public void test31() {
			System.out.println(" ");
			System.out.println("Test31:");
		    int res = (int) cal.justify(7, 9, 7);
			assertEquals(2, res, 0);
		}
		
	//测试是一般三角形
	@Test
	public void test40() {
		System.out.println(" ");
		System.out.println("Test40:");
		int res = (int) cal.justify(3, 4, 5);		
		assertEquals(3, res, 0);
	}
	
	//测试是一般三角形
	@Test
	public void test41() {
		System.out.println(" ");
		System.out.println("Test41:");
		int res = (int) cal.justify(9, 2, 8);		
		assertEquals(3, res, 0);
	}
	
}