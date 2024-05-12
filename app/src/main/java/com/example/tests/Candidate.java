package com.example.tests;

public class Candidate {
    private String name;
    private String position;
    private String experience;
    private int photoResId; // Идентификатор ресурса изображения

    public Candidate(String name, String position, String experience, int photoResId) {
        this.name = name;
        this.position = position;
        this.experience = experience;
        this.photoResId = photoResId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getExperience() {
        return experience;
    }

    public int getPhotoResId() {
        return photoResId;
    }
}