package com.flightreservation.flight.dao;
import java.util.List;

import com.flightreservation.flight.model.FlightData;

public interface FlightDataDAO {
	public int add(FlightData flightData);
	public int update(FlightData flightData);
	public FlightData get(Integer id);
	public int delete(Integer id);
	public List<FlightData> list();
}

