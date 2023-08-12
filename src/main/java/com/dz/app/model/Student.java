package com.dz.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@Builder
@Document(collection = "student")
public class Student {
	
	@Id
	private String id;
	
	private String firstName;
	private String lastName;
	
	
}
