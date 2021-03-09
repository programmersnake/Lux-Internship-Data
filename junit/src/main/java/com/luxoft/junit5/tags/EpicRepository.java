package com.luxoft.junit5.tags;

import java.util.ArrayList;
import java.util.List;

class EpicRepository {
    private final List<Epic> epics = new ArrayList();

    boolean exists(String name) {
        return epics.stream().anyMatch( epic -> epic.name().equals( name ) );
    }

    void save(Epic epic) {
        epics.add( epic );
    }
}
