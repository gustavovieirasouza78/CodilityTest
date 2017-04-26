import static org.junit.Assert.*;

import org.junit.Test;

public class testDivibleByPrint {

	@Test
	public void testDivisleBy3() {
		Solution solution = new Solution();
		assertEquals(true, solution.divisibleBy(30, 3, ""));
	}

	@Test
	public void testDivisleBy5() {
		Solution solution = new Solution();
		assertEquals(true, solution.divisibleBy(50, 5, ""));
	}
	
	@Test
	public void testDivisleByFail() {
		Solution solution = new Solution();
		assertEquals(false, solution.divisibleBy(49, 5, ""));
	}	
	
	@Test
	public void print1() {
		Solution solution = new Solution();
		assertEquals("1", solution.print(1));
	}
	
	@Test
	public void print3() {
		Solution solution = new Solution();
		assertEquals("Fizz", solution.print(3));
	}	
	
	@Test
	public void print5() {
		Solution solution = new Solution();
		assertEquals("Buzz", solution.print(5));
	}
	
	@Test
	public void print7() {
		Solution solution = new Solution();
		assertEquals("Woof", solution.print(7));
	}
	
	@Test
	public void print15() {
		Solution solution = new Solution();
		assertEquals("FizzBuzz", solution.print(15));
	}
}
