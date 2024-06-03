package com.springboot.spring_boot_01;

import java.io.*;

public class Course implements Serializable {
    @Serial
    private static final long serialVersionUID = 6234459767072557275L;

    private Long id;
    private String name;
    private String author;

    public Course(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
