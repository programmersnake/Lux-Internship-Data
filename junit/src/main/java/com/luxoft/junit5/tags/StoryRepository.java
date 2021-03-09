package com.luxoft.junit5.tags;

import java.util.ArrayList;
import java.util.List;

class StoryRepository {
    private final List<Story> stories = new ArrayList();

    boolean exists(String name) {
        return stories.stream().anyMatch( story -> story.name().equals( name ) );
    }

    void save(Story story) {
        stories.add( story );
    }
}
