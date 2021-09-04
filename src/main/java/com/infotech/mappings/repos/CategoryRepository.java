package com.infotech.mappings.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infotech.mappings.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
