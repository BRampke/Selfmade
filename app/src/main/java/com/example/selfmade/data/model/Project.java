package com.example.selfmade.data.model;

import java.util.List;

public class Project {

    private String id;
    private String name;
    private String shortDescription;
    private String detailedDescription;
    private boolean downloadable;
    private List<Material> requiredMaterials;
    private List<Tool> requiredTools;
    private double likes;

    private enum categories {
        Woodworking, Sew,
    }
    private enum tags { //TODO tbd Untergruppen der Kategorien wie z.B. Woodworking => drechseln, schnitzen,...
        Carving, Woodturning, Tipps//&Tricks
    }
    private enum severity {
        Beginner, Advanced, Professional
    }

    private List<Comment> comments;

    public Project(String id, String name, String shortDescription, String detailedDescription, boolean downloadable, List<Material> requiredMaterials, List<Tool> requiredTools) {
        this.id = id;
        this.name = name;
        this.shortDescription = shortDescription;
        this.detailedDescription = detailedDescription;
        this.downloadable = downloadable;
        this.requiredMaterials = requiredMaterials;
        this.requiredTools = requiredTools;
    }
}
