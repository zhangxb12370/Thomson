package com.kevin.po;

import javax.persistence.*;

/**
 * Created by kevin on 2016/12/8.
 * 使用jpa的namedQuery
 */
@Entity
@Table(name = "student")
//@NamedQuery(name = "Student.findByName",query = "select s from Student s where s.name = ?1")
public class Student {
    @Id
    @GeneratedValue
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
