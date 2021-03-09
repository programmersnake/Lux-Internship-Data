package com.luxoft.junit5.tags;

import java.util.List;

class TimeTrackerService {
    private final EpicRepository epicRepository;
    private final StoryRepository storyRepository;
    private final LdapUserService ldapUserService;

    TimeTrackerService(EpicRepository epicRepository, StoryRepository storyRepository, LdapUserService ldapUserService) {
        this.epicRepository = epicRepository;
        this.storyRepository = storyRepository;
        this.ldapUserService = ldapUserService;
    }

    List<User> findAllUsers() {
        return ldapUserService.findAllUsers();
    }

    boolean storyExists(String name) {
        return storyRepository.exists( name );
    }

    void save(Story story) {
        storyRepository.save( story );
    }

    boolean epicExists(String name) {
        return epicRepository.exists( name );
    }

    void save(Epic epic) {
        epicRepository.save( epic );
    }
}
