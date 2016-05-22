package csd.blr;

import junit.framework.TestCase;

public class TestLargest extends TestCase {

	public void testcase1() throws Exception {
		int[] arr = { 5, 6, 8, 3, 2 };
		Largest obj = new Largest();
		assertEquals(8, obj.find(arr));
	}

	public void testcase2() throws Exception {
		int[] arr = { 5, 6, 9, 3, 2 };
		Largest obj = new Largest();
		assertEquals(9, obj.find(arr));
	}

	public void testcase3() {
		int[] arr = { -5, -6, -9, -3, -2 };
		Largest obj = new Largest();
		try {
			assertEquals(-2, obj.find(arr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testcase4() {
		try {
			int[] arr = {};
			Largest obj = new Largest();
			assertEquals("Error", obj.find(arr));
			fail();
			
		} catch (Exception ex) {
			assertEquals("Arr is empty.", ex.getMessage());
			//assertTrue(true);
		}

	}

	public void testcase5() {
		int[] arr = { -5, -6, -9, -3, -2, -2 };
		Largest obj = new Largest();
		try {
			assertEquals(-2, obj.find(arr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
