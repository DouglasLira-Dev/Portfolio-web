package com.portifolio.model;

public class Project {
    private String name;
    private String description;
    private String githubUrl;
    private String icon;
    private String[] tags;

    // Construtor com todos os campos
    public Project (String name, String description, String githubUrl, String icon, String[] tags) {
        this.name = name;
        this.description = description;
        this.githubUrl = githubUrl;
        this.icon = icon;
        this.tags = tags;
    }

    // Getters - Thymeleaf precisa deles para acessar os dados
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public String getIcon() {
        return icon;
    }

    public String[] getTags() {
        return tags;
    }
}
