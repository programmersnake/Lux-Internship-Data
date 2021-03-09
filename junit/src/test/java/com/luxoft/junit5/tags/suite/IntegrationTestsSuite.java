package com.luxoft.junit5.tags.suite;


import com.luxoft.junit5.tags.EpicRepositoryTest;
import com.luxoft.junit5.tags.LdapUserServiceTest;
import com.luxoft.junit5.tags.StoryRepositoryTest;
import com.luxoft.junit5.tags.TimeTrackerServiceTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@IncludeTags("integration")
@ExcludeTags("slow")
@SelectClasses({StoryRepositoryTest.class, EpicRepositoryTest.class, LdapUserServiceTest.class, TimeTrackerServiceTest.class})
public class IntegrationTestsSuite {
}
