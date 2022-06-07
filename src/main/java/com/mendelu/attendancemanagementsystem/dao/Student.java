package com.mendelu.attendancemanagementsystem.dao;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    private Integer student_id;
    private String name;
    private String email;
    private String birthday;
    private String address;
    private Integer term;
    @ManyToOne
    @JoinColumn(name="course_id", nullable=false)
    private Course course;

    public Student(Integer id, String name, String email, String birthday, String address, Integer term) {
        this.student_id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.address = address;
        this.term = term;
    }

    public Student() {

    }

    public Integer getId() {
        return student_id;
    }

    public void setId(Integer id) {
        this.student_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + student_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", term=" + term +
                '}';
    }
}
