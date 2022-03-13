package com.example.demo.servicios;

import java.util.List;

import com.example.demo.modelos.Travel;
import com.example.demo.repositorios.TravelRepositorio;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class TravelServicio {
	private TravelRepositorio repositorioViaje;
	
	
	public TravelServicio(TravelRepositorio repositorioViaje) {
		
		this.repositorioViaje = repositorioViaje;
	}

		
	//Para poder visualizar todos los viajes
	public List<Travel> SelectAllTravels(){
		return repositorioViaje.findAll();
	}
	
	//Para poder guardar y crear
	public Travel CreateTravel(Travel newTravel) {
		return repositorioViaje.save(newTravel);
	}
	
	//Encontrar el id para edit y mostrarlo 
	public Travel FindId(Long id) {
		Optional<Travel> optionalTravel=repositorioViaje.findById(id); 
		if(optionalTravel.isPresent()) {
			return optionalTravel.get(); 
		} 
		else {
			return null;
		}
	}
	
	
	//Update travel
	public void updateTravels( Travel editarTravel ) {
		
		repositorioViaje.actualizaviaje( editarTravel.getVendor(), //los saco de los constructores del modelo
										editarTravel.getExpense(), 
										editarTravel.getAmount(), 
										editarTravel.getDescription(),
										editarTravel.getId()
										  ); 								   
	}
	
	
	
	
	//Delete by id
	public Long deleteFromId( long id ) {
		return repositorioViaje.deleteById(id);
	}
	

}
