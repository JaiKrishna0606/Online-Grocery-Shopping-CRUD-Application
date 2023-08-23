package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.ItemDetails;

public interface ItemRepo extends JpaRepository<ItemDetails, Integer>{

}
