package com.mendelu.attendancemanagementsystem.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CourseDAOImpl implements CourseDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Course> findAll() {
        try {
            return entityManager.createQuery("select c from Course c", Course.class).getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void save(Course course) {
        if (course.getId() != null) {
            try {
                entityManager.merge(course);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                entityManager.persist(course);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete(Course course) {
        try {
            entityManager.remove(findById(course.getId()));
        } catch (Exception e) {
        }
    }

    @Override
    public Course findById(Long id) {
        try {
            return entityManager.find(Course.class, id);
        } catch (Exception e) {
            return null;
        }
    }
}
