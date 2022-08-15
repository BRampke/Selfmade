package com.example.selfmade.data.model;

import java.util.List;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser {

    private String id;
    private String displayName;
    private String email;
    private UserType userType;
    private List<Project> createdProjects;
    private List<Project> deletedProjects;
    private List<Project> likedProjects;
    private List<LoggedInUser> following;

    public LoggedInUser(String id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }
}