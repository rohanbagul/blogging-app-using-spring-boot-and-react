package com.rohanbagul.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohanbagul.blog.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
