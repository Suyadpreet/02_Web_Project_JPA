package com.suyad.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.suyad.Entity.Books;
import com.suyad.Repository.BooksRepo;

@Component
public class AppRunner implements ApplicationRunner
{
	@Autowired
	BooksRepo r;
	
	public AppRunner()
	{
		System.out.println("Constructor of App Runner class");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		System.out.println("Runner method Called");
		Books b1 = new Books();
		b1.setBookName("core Java");
		b1.setPrice(450d);
		
		Books b2 = new Books();
		b2.setBookName("Adv Java");
		b2.setPrice(500d);
		
		Books b3 = new Books();
		b3.setBookName("Hibernate");
		b3.setPrice(250d);
		
		Books b4 = new Books();
		b4.setBookName("Spring Core");
		b4.setPrice(550d);
		
		Books b5 = new Books();
		b5.setBookName("Spring Boot");
		b5.setPrice(900d);
		
		r.saveAll(Arrays.asList(b1,b2,b3,b4,b5));
	}

}
