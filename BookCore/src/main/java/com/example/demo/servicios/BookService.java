package com.example.demo.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelos.Book;
import com.example.demo.repositorios.BookRepository;

@Service
public class BookService {
	@Autowired //Para extraer del repositorio
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks(){
		List<Book> books = bookRepository.findAll();
		return books;
	}
	
	public Optional<Book> findBookById(Long id){
		Optional<Book> potentialBook = bookRepository.findById(id);
		return potentialBook;
		
	}
	
	public void saveBook(Book book){
		bookRepository.save(book);	
	}
	
	public void deleteBookById(Long id){
		bookRepository.deleteById(id);
	}
}
