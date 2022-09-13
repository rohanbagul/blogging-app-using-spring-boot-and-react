package com.rohanbagul.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rohanbagul.blog.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
