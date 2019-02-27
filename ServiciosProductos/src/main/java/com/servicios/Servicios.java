package com.servicios;

import java.util.List;

import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import com.entidad.City;
import com.entidad.Hotel;
import com.entidad.Producto;
import com.entidad.SportEvent;
import com.entidad.Transport;
import com.entidad.TransportCompany;

@Service
public class Servicios implements IServicios{
	public Producto buscarProductoPorCodigo(int codigoProducto) {
		//Implementación lógica de negocio
		//Comunicación con servicio REST Datasource
		//Para obtener json con data del producto
		
		Producto producto = new Producto();
		Hotel hotel = new Hotel();
		City city = new City();
		SportEvent sportEvent = new SportEvent();
		Transport transport = new Transport();
		TransportCompany transportCompany = new TransportCompany();
		
		city.setCode(1);
		city.setId(1);
		city.setName("city1");
		
		sportEvent.setId(1);
		sportEvent.setEventName("event1");
		sportEvent.setEventDescription("event description");
		sportEvent.setAddress("cra");
		sportEvent.setDiscountPercentage(1);
		sportEvent.setPrice(10);
		sportEvent.setTicketsAvailable(1);
		sportEvent.setVat(1);
		sportEvent.setCity(city);
		
		hotel.setId(1);
		hotel.setName("Hotel1");
		hotel.setAddress("cll");
		hotel.setRoomsAvailable(1);
		hotel.setRoomsBooked(1);
		hotel.setCity(city);
		
		transport.setId(1);
		transport.setCompany(transportCompany);
		transport.setDeparture("departure");
		transport.setDescription("desc");
		transport.setDestination("destination");
		transport.setDiscount(1);
		transport.setOrigin("origin");
		transport.setPrice(1);
		transport.setReference("ref");
		transport.setType("bus");
		transport.setVat(1);
		
		producto.setId(1);
		producto.setProductName("Product1");
		producto.setProductDescription("Product description");
		producto.setItemsAvailable(1);
		producto.setItemsBooked(1);
		producto.setHotel(hotel);
		producto.setTransport(transport);
		producto.setSportEvent(sportEvent);
		producto.setPrice(1);
		producto.setType("product1");
		producto.setVat(1);
		
//		RestTemplate restTemplate = new RestTemplate();
		//URL del servicio
//        Producto producto = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Producto.class);
        return producto;
	}
	
	public List<Producto> buscarProductosPorNombre(String nombre){
		//Manejo de comodín, para enviar a servicio datasource
		return null;
	}
	
	public List<Producto> buscarProductosPorDescripcion(String descripcion){
		//Manejo de comodín, para enviar a servicio datasource		
		return null;
	}
}
