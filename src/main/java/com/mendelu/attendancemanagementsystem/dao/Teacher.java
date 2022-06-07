package com.mendelu.attendancemanagementsystem.dao;

import javax.persistence.*;

@Entity
@Table(name = "TEACHER")
public class Teacher {
    @Id
    private Long teacher_id;
    private String name;
    private String email;
    private String birthday;
    private String address;
    @ManyToOne
    @JoinColumn(name="course_id", nullable=false)
    private Course course;



    public Teacher(Long id, String name, String email, String birthday, String address) {
        this.teacher_id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.address = address;
    }

    public Teacher() {

    }

    public Long getId() {
        return teacher_id;
    }

    public void setId(Long id) {
        this.teacher_id = id;
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

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + teacher_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
