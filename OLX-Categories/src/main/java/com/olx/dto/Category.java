package com.olx.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Category {
	public Category(Object id2, Object name2, Object description2) {
		// TODO Auto-generated constructor stub
	}
	private long id;
	private String name;
	private String description;
}
