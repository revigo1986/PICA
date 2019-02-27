package com.servicios;

import java.util.List;

import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import com.entidad.City;
import com.entidad.Hotel;
import com.entidad.Product;
import com.entidad.SportEvent;
import com.entidad.Transport;
import com.entidad.TransportCompany;

@Service
public class Servicios implements IServicios{
	public Product buscarProductoPorCodigo(int codigoProducto) {
		//Implementación lógica de negocio
		//Comunicación con servicio REST Datasource
		//Para obtener json con data del producto
		
		Product producto = new Product();
		Hotel hotel = new Hotel();
		City city1 = new City();
		City city2 = new City();
		SportEvent sportEvent = new SportEvent();
		Transport transport = new Transport();
		TransportCompany transportCompany = new TransportCompany();
		
		transportCompany.setId(1);
		transportCompany.setCompanyName("Coomotor");
		
		city1.setCode("1");
		city1.setId(1);
		city1.setName("Neiva");
		
		city2.setCode("2");
		city2.setId(1);
		city2.setName("Bogota");
		
		sportEvent.setId(1);
		sportEvent.setEventName("Millonarios-Huila");
		sportEvent.setEventDescription("Partido de futbol");
		sportEvent.setAddress("Campin");
		sportEvent.setDiscountPercentage(1);
		sportEvent.setPrice(300000);
		sportEvent.setTicketsAvailable(2);
		sportEvent.setVat(1);
		sportEvent.setCity(city2);
		
		hotel.setId(1);
		hotel.setName("Bogota Hotel");
		hotel.setAddress("Galerias");
		hotel.setRoomsAvailable(1);
		hotel.setRoomsBooked(1);
		hotel.setCity(city2);
		
		transport.setId(1);
		transport.setDeparture("Terminal");
		transport.setDescription("Transporte en bus hasta Bogota");
		transport.setDestination(city2);
		transport.setDiscount(1);
		transport.setOrigin(city1);
		transport.setPrice(50000);
		transport.setReference("123456789");
		transport.setType("Bus");
		transport.setVat(1);
		transport.setCompany(transportCompany);
		
		producto.setId(1);
		producto.setProductName("Paquete1");
		producto.setProductDescription("Paquete bus, hotel, futbol Bogota");
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
	
	public List<Product> buscarProductosPorNombre(String nombre){
		//Manejo de comodín, para enviar a servicio datasource
		return null;
	}
	
	public List<Product> buscarProductosPorDescripcion(String descripcion){
		//Manejo de comodín, para enviar a servicio datasource		
		return null;
	}
}
