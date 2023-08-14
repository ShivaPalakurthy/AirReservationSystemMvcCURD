package com.flightreservation.flight.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.flightreservation.flight.model.FlightData;

class FlightDataDAOTest {
	
	private DriverManagerDataSource datasource;
	private FlightDataDAO dao;
	
	@BeforeEach
	void setupBeforeEach() {
		datasource=new DriverManagerDataSource();
		datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		datasource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		datasource.setUsername("c##shivapalakurthy");
		datasource.setPassword("1234567890");
		
		dao=new FlightDataDAOImpl(datasource);
	}

	@Test
	void testAdd() {
		int Dd, Dm, Dy, Th, Tm;
		Dd=2023;
		Dm=8;
		Dy=21;
		Th=11;
		Tm=30;
		 Timestamp timestamp=new Timestamp(Dd,Dm, Dy, Th,Tm , 0, 0);
		FlightData flightData=new FlightData(1023,123,"Air India","Chennai","Hyderabad",timestamp,30,19,5000,40,21,4500,50,20,4000,120,60);
		int result=dao.add(flightData);
		assertTrue(result>0); 
	}
	
 
	@Test
	void testUpdate() {
		int Dd, Dm, Dy, Th, Tm;
		Dd=2023;
		Dm=8;
		Dy=21;
		Th=13;
		Tm=30;
		 Timestamp timestamp=new Timestamp(Dd,Dm, Dy, Th,Tm , 0, 0);
		 int bt=40,ft=55,et=70;
		 int bs=11,fs=27,es=19;
		 int ts=bt+ft+et;
		 int tvs=bs+fs+es;
		FlightData flightData=new FlightData(2341002,1023,123,"Spice Jet","Hyderabad","Goa",timestamp,bt,bs,5700,ft,fs,4799,et,es,4200,ts,tvs);
		int result =dao.update(flightData);
		assertTrue(result>0);
	}

	@Test
	void testGet() {
		Integer id=2341009;
		FlightData fd=dao.get(id);
		if(fd!=null)
			System.out.println(fd);
		assertNotNull(fd);
	} 

	@Test
	void testDelete() {
		Integer id=2341051;
		int result=dao.delete(id);
		assertTrue(result>0);
	}

	@Test
	void testList() {
		List<FlightData> listflights=dao.list();
		for(FlightData aFlight:listflights)
		{
			System.out.println(aFlight);
		}
		assertTrue(!listflights.isEmpty());
	}

}
