package com.example.demo20240509;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BandApi {
	
	
	public BandApi(String name, String member, String date, String about) {
		super();
		this.name = name;
		this.member = member;
		this.date = date;
		this.about = about;
	}

	private String name;
	private String member;
	private String date;
	private String about;
	
	@Id
	@GeneratedValue
	private int id;

}
