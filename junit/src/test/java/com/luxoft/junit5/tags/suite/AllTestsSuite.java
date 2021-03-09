package com.luxoft.junit5.tags.suite;


import com.luxoft.junit5.tags.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        StoryTest.class,
        EpicTest.class,
        StoryRepositoryTest.class,
        EpicRepositoryTest.class,
        LdapUserServiceTest.class,
        TimeTrackerServiceTest.class
})
public class AllTestsSuite {
}
