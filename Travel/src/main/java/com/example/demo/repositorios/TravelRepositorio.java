package com.example.demo.repositorios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.modelos.Travel;

@Repository // Se debe señalar que es un repositorio
public interface TravelRepositorio extends CrudRepository<Travel, Long>  { //Extiendo CRUD y long por el ID
	    // SELECT * FROM travels
		List<Travel> findAll();
		
		// INSERT INTO travels(amount, vendor , description, expense)
		// VALUES( Objeto con todos los datos )
		@SuppressWarnings("unchecked")
		Travel save( Travel newTravel );
		
		
		// FIND BY ID
		Travel findById(long id);
		
		
		// DELTE FROM travels WHERE nombre_travel = expense
				
		@Transactional
		Long deleteById( long id );
		
		
		//UPDATE
		@Transactional
		@Modifying
		@Query(value="UPDATE travels "+ "SET expense = :expense, vendor = :vendor, amount= :amount, description = :description " +
				"WHERE id = :id", nativeQuery = true )
		void actualizaviaje(@Param("expense")String expense,@Param("vendor") String vendor,@Param("amount") Double double1,
				            @Param("description")String description, @Param("id")long id);
			
		
		
		
	

}
