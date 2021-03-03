package com.javatpoint;

import com.javatpoint.Student;

import java.util.List;
import java.util.Optional;


public class ClassRoom {
    private String roomId;
    Optional<List<Student>> studentList;

       ClassRoom(String roomID,Optional<List<Student>>studentList){
        this.roomId=roomId;
       this.studentList=studentList;

    }
    public boolean hasStudent()
    {
        long count = studentList.get().stream()
                .filter(student -> student.subjects.get().size()==0)
                .count();
        return count==0 ? true : false;
    }



    public void studentsWithparticulartRoomId(String id)
    {
        studentList.stream()
                .filter(l -> l.getRoomID().equals("xyz"))
                .forEach(student -> System.out.println("Student Name: "+student));

    }

    public void studentsWithNoSubjects()
    {
        studentList.get().stream()
                .filter(student -> student.subjects.get().size()==0)
                .forEach(student -> System.out.println("Students with no subjects"+student));
    }
}