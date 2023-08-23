package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.UserDetails;

public interface UserRepo extends JpaRepository<UserDetails, Long> {

}
