package com.kodilla.stream.forumuser;
import java.time.*;


public class ForumUser {
    private int id;
    private String username;
    private char sex;
    private LocalDate birthdayDate;
    private int postsQuantity;

    public ForumUser(int id, String username, char sex, LocalDate birthdayDate, int postsQuantity) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.postsQuantity = postsQuantity;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
