/**
 *
 */
package se283.a1.t2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import se283.a1.t1.Counter;

/**
 * Test class for Counter class
 * @author Maryam Zehra
 * @version 6/8/2021
 *
 */
class CounterTest {

	/**
	 * Test method for {@link se283.a1.t1.Counter#increment()}.
	 */
	@Test
	void testIncrement() {
		Counter a = Counter.newInstance();
		a.reset();
		a.increment();
		assertequals(a._ctr, 1);

	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#decrement()}.
	 */
	@Test
	void testDecrement() {
		Counter a = CounterTest.newInstance();
		a.reset();
		a.increment();
		a.increment();
		a.decrement();
		assertequals(a._ctr, 1);
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#reset()}.
	 */
	@Test
	void testReset() {
		Counter a = CounterTest.newInstance();
		a.reset();
		a.increment();
		a.increment();
		a.reset();
		assertequals(a._ctr, 0);	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#multiplyBy(int)}.
	 */
	@Test
	void testMultiplyBy() {
		Counter a = CounterTest.newInstance();
		a.reset();
		a.increment();
		a.increment();
		a.multipyBy(4);
		assertequals(a._ctr, 8);	}

}
}