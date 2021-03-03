package com.javatpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class College {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        list1.add("Java");
        list1.add("Python");

        Optional<List<String>> subjectList1 = Optional.of(list1);

        List<Student> students1 = new ArrayList<Student>();
        //students1.add(std);
       // students1.add(1,1);

        Optional<List<Student>> studentNameList1 = Optional.of(students1);



        Student std = new Student("Gaurav", 1, "xyz", subjectList1);
        students1.add(std);


        ClassRoom classRoom  = new ClassRoom("xyz",studentNameList1);
        System.out.println(classRoom.hasStudent());

        classRoom.studentsWithparticulartRoomId("xyz");
        classRoom.studentsWithNoSubjects();
    }

}