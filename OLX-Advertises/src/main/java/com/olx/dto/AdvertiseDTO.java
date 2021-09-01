package com.olx.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AdvertiseDTO {
	private long id;
	private String title;
	private String description;
	private double price;
	private long categories;
	private String category;
	private LocalDate createdDate;
	private LocalDate modifiedDate;
	private String active;
	private String username;
	private String postedBy;
	public AdvertiseDTO(long id, String title, String description, double price, long categories, LocalDate createdDate,
			LocalDate modifiedDate, String active, String username, String postedBy,String category) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.categories = categories;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.active = active;
		this.username = username;
		this.postedBy = postedBy;
		this.category = category;
	}
	public AdvertiseDTO(long id2, String title2, String description2, double price2, long category2, String string,
			LocalDate createdDate2, String modifiedDate2, String active2, String username2, String postedBy2) {
		// TODO Auto-generated constructor stub
	}
	public AdvertiseDTO(long id2, String title2, String description2, double price2, long category2,
			LocalDate createdDate2, String modifiedDate2, String active2, String username2, String postedBy2,
			String name) {
		// TODO Auto-generated constructor stub
	}
	public void setUsername(String username2) {
		// TODO Auto-generated method stub
		
	}
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	public long getCategories() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getPostedBy() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
