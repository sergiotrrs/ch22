package test.bank;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ BankTest.class, MathTest.class })
public class AllTests {

}
