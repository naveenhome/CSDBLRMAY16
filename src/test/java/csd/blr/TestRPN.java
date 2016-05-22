package csd.blr;

import junit.framework.TestCase;

import org.junit.Test;

public class TestRPN extends TestCase {

	public void testPositiveWith2Values1Optr() throws Exception {
		try {

			String expr = "3,2,+";
			RPNCalc obj = new RPNCalc();
			assertEquals(5, obj.calculate(expr));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testPositive2With2Values1Optr() throws Exception {
		try {
			String expr = "3,3,+";
			RPNCalc obj = new RPNCalc();
			assertEquals(6, obj.calculate(expr));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(expected=Exception.class)
	public void testNegativeWithEmptyExpr() throws EpmtyExprException {
		try {
			String expr = "";
			expr= "+,2";
			expr= "+,2,2";
			expr= "2,2,+,2";
			expr = "2,!,2";
			expr = "2,#,2";
			expr = "2,#,a";
			RPNCalc obj = new RPNCalc();
			assertEquals(0, obj.calculate(expr));
			fail();
		} catch (Exception ex) {
			assertEquals("Expr is empty.", ex.getMessage());
			//assertTrue(true);
		}

	}

}
