package com.kevin.dao;

import com.kevin.po.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by kevin on 2016/12/8.
 */
public interface PersonRepository extends JpaRepository<Person,Integer> {
    /**
     *
     *   通过名字相等查询
     * 相当于jpql:select p from Person p where p.name = ?1
     */
//    List<Person> findByName(String name);

    /**
     *
     *
     *  相当于jpql:select p from Person p where p.name like ?1
     */
//    List<Person> findByNameLike(String name);

    /**
     *
     *
     *
     *  相当于jpql:select p from Person p where p.name = ?1 and p.address = ?2
     */
//    List<Person> findByNameAndAddress(String name,String address);

    /**
     * 获得符合条件的前10条数据
     *
     *
     */
//    List<Person> findFirst10ByName(String name);

    /**
     * 获得符合条件的前30条数据
     *
     *
     */
//    List<Person> findTop30ByName(String name);
}
