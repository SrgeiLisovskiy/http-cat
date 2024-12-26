package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Animal {
    @JsonProperty
    private String id;

    @JsonProperty
    private String text;
    @JsonProperty
    private String type;
    @JsonProperty
    private String user;
    @JsonProperty
    private Long upvotes;

    public Animal() {
    }

    public Animal(String id, String text, String type, String user, Long upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes='" + upvotes + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setUpvotes(Long upvotes) {
        this.upvotes = upvotes;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Long getUpvotes() {
        return upvotes;
    }
}
