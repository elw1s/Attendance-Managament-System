package com.mendelu.attendancemanagementsystem.dao;

import java.util.List;

public interface CourseDAO {

        List<Course> findAll();

        void save(Course Product);

        void delete(Course Product);

    Course findById(Long id);

}
