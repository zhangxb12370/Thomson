package com.kevin.dao;

import com.kevin.po.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by kevin on 2016/12/8.
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {
    /**
     *
     * 这里使用的是namedQuery定义的查询语句
     */
//    List<Student> findByName();

    /**
     *
     * 使用@Query注解查询
     */
//    @Query("select s from Studnet s")
//    List<Student> findAll();
}
