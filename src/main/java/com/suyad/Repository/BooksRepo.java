package com.suyad.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suyad.Entity.Books;

public interface BooksRepo extends JpaRepository<Books, Integer> 
{

}
