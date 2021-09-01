package com.olx.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="categories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CategoryEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	private String name;
	private String description;
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}
