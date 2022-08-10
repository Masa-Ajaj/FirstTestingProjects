package test.suites;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Tests.accountTest;
import Tests.transactionsTest;


//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({ 
 accountTest.class ,transactionsTest.class
})

public class TestSuite1 {


}
