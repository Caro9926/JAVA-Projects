package com.example.demo.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelos.Book;

@Repository //Le debo indicar esto, es long porque es el type del id
public interface RepositoryBook extends CrudRepository<Book, Long> {
	List<Book> findAll();
    // este método encuentra libros con descripciones que contienen la cadena de búsquedacopy
    List<Book> findByDescriptionContaining(String search);
    // este método cuenta cuántos títulos contienen una determinada cadena
    Long countByTitleContaining(String search);
    // este método elimina un libro que comienza con un título específico
    Long deleteByTitleStartingWith(String search);

}
