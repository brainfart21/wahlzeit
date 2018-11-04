package org.wahlzeit.testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        HandlersSuite.class,
        ModelSuite.class,
        ServicesSuite.class
})
public class AllTests {
}
