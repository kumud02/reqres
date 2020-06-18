package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass {
	@Before
	public void setup() {
		System.out.println("Setup Done");

	}

	@After
	public void tearDown() {
		System.out.println("Tear Down");
	}

}
