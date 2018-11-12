package org.wahlzeit.model;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
        org.wahlzeit.model.persistence.DatastoreAdapterTest.class,
		org.wahlzeit.model.AccessRightsTest.class,
		org.wahlzeit.model.BreadTest.class,
        org.wahlzeit.model.CoordinateTest.class,
        org.wahlzeit.model.FlagReasonTest.class,
        org.wahlzeit.model.GenderTest.class,
        org.wahlzeit.model.GuestTest.class,
        org.wahlzeit.model.LocationTest.class,
        org.wahlzeit.model.PhotoFilterTest.class,
        org.wahlzeit.model.TagsTest.class,
        org.wahlzeit.model.UserStatusTest.class,
        org.wahlzeit.model.ValueTest.class
})
public class ModelSuite {
}
