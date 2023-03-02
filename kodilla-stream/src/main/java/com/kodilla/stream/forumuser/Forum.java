package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Wojtek", 'M', LocalDate.of(1975, Month.DECEMBER, 9),30));
        forumUserList.add(new ForumUser(2, "Ania", 'F', LocalDate.of(2000, Month.OCTOBER, 12),3));
        forumUserList.add(new ForumUser(3, "Mateusz", 'M', LocalDate.of(1999, Month.DECEMBER, 10),4));
        forumUserList.add(new ForumUser(4, "Jola", 'F', LocalDate.of(1987, Month.APRIL, 5),15));
        forumUserList.add(new ForumUser(5, "Zygfryd", 'm', LocalDate.of(1974, Month.NOVEMBER, 17),2));

    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}