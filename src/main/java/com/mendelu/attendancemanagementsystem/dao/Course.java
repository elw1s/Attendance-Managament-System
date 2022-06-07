package com.mendelu.attendancemanagementsystem.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "COURSE")
public class Course {

    @Id
    private Long course_id;
    private String name;
    private Integer capacity;
    private Integer num_student;
    @OneToMany (mappedBy="course")
    private List<Student> studentList;
    @OneToMany (mappedBy="course")
    private List<Teacher> teacherList;

    public Course(Long id, String name, Integer capacity, Integer num_student, List<Student> studentList, List<Teacher> teacherList) {
        this.course_id = id;
        this.name = name;
        this.capacity = capacity;
        this.num_student = num_student;
        this.studentList = studentList;
        this.teacherList = teacherList;
    }

    public Course() {

    }


}
