package com.mauirestaurantreviews.mauirestaurantreviews;

public class Review {

	private long id;
	private String title;
	private String body ;
	private String description ;
	private String picture ;

	public Review(long id, String title, String body, String description, String picture) {
		this.id = id;
		this.setTitle(title);
		this.setBody(body);
		this.setDescription(description);
		this.setPicture(picture);
		
	}
	

	public Long getId() {
		return id;
	

	

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
}
