import junit.framework.TestCase;

public class TestCaseConv extends TestCase {

	// Test One : Both the fields are empty.
	// Objective: Invalid Boundary Value : "" "".
	// Expected Output : false

	public void test001() {
		TestValidation vs = new TestValidation();
		assertEquals(false, vs.validate("", ""));
	}

	// Test two : Both the fields are not empty.
	// Objective: valid Boundary Value : "35" "45".
	// Expected Output : true

	public void test002() {
		TestValidation vs = new TestValidation();
		assertEquals(true, vs.validate("35", "45"));
	}

	// Test three : Both the fields are not in range.
	// Objective: invalid Boundary Value : "110" "215".
	// Expected Output : false

	public void test003() {
		TestValidation vs = new TestValidation();
		assertEquals(true, vs.validate("110", "215"));
	}

	// Test four : Both the fields are in range .
	// Objective: valid in lower Boundary Value : "0" "0".
	// Expected Output : true

	public void test004() {
		TestValidation vs = new TestValidation();
		assertEquals(true, vs.ValidateUP("0", "0"));
	}

	// Test five : Both the fields are in range.
	// Objective: valid in middle Boundary Value : "50" "106".
	// Expected Output : true

	public void test005() {
		TestValidation vs = new TestValidation();
		assertEquals(true, vs.ValidateUP("50", "106"));
	}

	// Test six : Both the fields are in range.
	// Objective: valid in upper Boundary Value : "100" "212".
	// Expected Output : true

	public void test006() {
		TestValidation vs = new TestValidation();
		assertEquals(true, vs.ValidateUP("100", "212"));
	}

	// Test seven : Both the fields are not in range.
	// Objective: invalid in Boundary Value : "120" "250".
	// Expected Output : false

	public void test007() {
		TestValidation vs = new TestValidation();
		assertEquals(true, vs.ValidateUP("120", "250"));
	}
	
	

}