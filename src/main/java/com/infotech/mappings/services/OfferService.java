package com.infotech.mappings.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.mappings.entities.Offer;
import com.infotech.mappings.repos.OfferRepository;

@Service
public class OfferService {
	
	@Autowired
	private OfferRepository offerRepository;
	
	public Offer addOffer(Offer offer) {
		return offerRepository.save(offer);
	}
	
	public List<Offer> getAllOffers(){
		return offerRepository.findAll();
	}
}
