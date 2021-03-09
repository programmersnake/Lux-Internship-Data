package com.luxoft.junit5.tags.suite;


import com.luxoft.junit5.tags.EpicTest;
import com.luxoft.junit5.tags.StoryTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@IncludeTags("unittest")
@SelectClasses({EpicTest.class, StoryTest.class})
public class UnitTestsSuite {
}
