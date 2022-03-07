package com.example.demo.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.demo.modelos.Book;
import com.example.demo.repositorios.RepositoryBook;



@Service
public class BookService {
private final RepositoryBook bookRepository;
    
    public BookService(RepositoryBook bookRepository) {
        this.bookRepository = bookRepository;
    }
    // devuelve todos los libros
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // crea un libro
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // recupera un libro
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id); //primero se debe encontrar
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    //eliminar un libro
    public void deleteBook(Long id) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
		
		if (optionalBook.isPresent()) {
			bookRepository.deleteById(id);			
		} 
        
    }
    
    //actualizar un libro
    
    public Book updateBook(Long id, Book book) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		
		if (optionalBook.isPresent()) {
			Book data = optionalBook.get();
			data.setDescription(book.getDescription());
			data.setLanguage(book.getLanguage());
			data.setNumberOfPages(book.getNumberOfPages());
			data.setTitle(book.getTitle());
			
			return bookRepository.save(data);
		}
		
		return null;
	}
    
   
    

}
