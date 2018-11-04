package org.wahlzeit.testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
        org.wahlzeit.handlers.TellFriendTest.class
})
public class HandlersSuite {
}
