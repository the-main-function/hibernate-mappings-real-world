package com.infotech.mappings.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infotech.mappings.entities.Category;
import com.infotech.mappings.entities.Offer;
import com.infotech.mappings.entities.Product;

@Repository
public interface OfferRepository extends JpaRepository<Offer,Integer> {

}
