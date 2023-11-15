package com.example.DMS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;

/**
 * @author Prashanthi Rayala
 * Nov 12, 2023
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {

    List<Dog> findByName(String name);

}
