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

    public Long getId() {
        return course_id;
    }

    public void setId(Long course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getNum_student() {
        return num_student;
    }

    public void setNum_student(Integer num_student) {
        this.num_student = num_student;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_id=" + course_id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", num_student=" + num_student +
                ", studentList=" + studentList +
                ", teacherList=" + teacherList +
                '}';
    }
}
