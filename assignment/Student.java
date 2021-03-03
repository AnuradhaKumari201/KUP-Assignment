package com.javatpoint;

import java.util.Optional;
import java.util.List;

public class Student {
    private String name;
    private int rollNumber;
    private String roomId;
    Optional<List<String>> subjects;

    public String getRoomID(){
        return this.name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", roomId='" + roomId + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    public Student(String name, int rollNumber, String roomId, Optional<List<String>> subjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.roomId = roomId;
        this.subjects = subjects;


    }
}

