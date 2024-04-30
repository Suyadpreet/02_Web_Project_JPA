package com.suyad.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@Component
public class Books 
{
	@Id
	@GeneratedValue
	private Integer bookId;
	private String bookName;
	private Double price;
}
