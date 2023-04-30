package com.dream.thoughts.springrestapidocumentationopenapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dream.thoughts.springrestapidocumentationopenapi.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
