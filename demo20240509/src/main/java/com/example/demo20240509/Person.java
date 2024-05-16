package com.example.demo20240509;

//import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
	
	
	public Person(String string, int i, String string2) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name=string;
		this.age=i;
		this.address=string2;
	}

	private String name="名無し";
	private int age=0;
	private String address;
	
	@Id
	@GeneratedValue
	private int id;
	
}
