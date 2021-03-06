package com.mauirestaurantreviews.mauirestaurantreviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository

public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review review1 = new Review(1L, "Cool Cat Cafe", "Great restaurant and good prices!", "5+ Star Rating", "/images/CoolCat.png");
		Review review2 = new Review(2L, "The Pioneer Inn", "Best breakfast ever!", "5+ Star Rating", "/images/PioneerInn.png");
		Review review3 = new Review(3L, "Hula Girl", "Great way to see the sunset!", "5+ Star Rating", "/images/HulaGirl.png");
		
		reviewList.put(review1.getId(), review1);
		reviewList.put(review2.getId(), review2);
		reviewList.put(review3.getId(), review3);
		
	}

	//constructor for testing purposes
	public ReviewRepository(Review...reviews) {
		for (Review review: reviews) {
		reviewList.put(review.getId(), review);
		}
		
	}

	public Review findOne(long id) {
		// TODO Auto-generated method stub
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		// TODO Auto-generated method stub
		return reviewList.values();
	}

}
