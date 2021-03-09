package com.luxoft.junit5.tags.suite;


import com.luxoft.junit5.tags.EpicRepositoryTest;
import com.luxoft.junit5.tags.StoryRepositoryTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@IncludeTags("integration")
@SelectClasses({StoryRepositoryTest.class, EpicRepositoryTest.class})
public class RepositoriesTestsSuite {
}
