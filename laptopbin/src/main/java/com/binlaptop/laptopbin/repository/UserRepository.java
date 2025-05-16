package com.binlaptop.laptopbin.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.binlaptop.laptopbin.domain.User;;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User doanhbino);

    void deleteById(long id);

    List<User> findByEmail(String email);

    List<User> findAll();

    User findById(long id);
}
