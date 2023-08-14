package com.flightreservation.flight.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.flightreservation.flight.model.FlightData;

public class FlightDataDAOImpl implements FlightDataDAO {

	
	private JdbcTemplate jdbcTemplate;
	
	public FlightDataDAOImpl(DataSource datasource) {
	 this.jdbcTemplate=new JdbcTemplate(datasource);
}
	@Override
	public int add(FlightData f) {
		String sql="INSERT INTO FLIGHT_DATA (FLIGHT_DETAIL_ID, ADMIN_ID, FLIGHT_COMPANY, FLIGHT_SRC,"
				+ " FLIGHT_DES, TRAVEL_DATE_TIME, BUSSINESS_TOTALSEATS, BUSSINESS_SEAT_AVAILABLE, BUSINESSCLASS_PRICE,"
				+ " FIRSTCLASS_TOTALSEATS, FIRST_SEAT_AVAILABLE, FIRSTCLASS_PRICE, ECONOMYCLASS_TOTALSEATS, "
				+ "ECONOMY_SEAT_AVAILABLE, ECONOMYCLASS_PRICE, TOTAL_NOOFSEATS, TOTAL_AVAILABLE_SEATS) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql,f.getFlightdetailid(),f.getAdminid(),f.getFlightcompany(),f.getFlightsrc(),f.getFlightdesc(),
				f.getTraveldatetime(),f.getBtotalseats(),f.getBseatavailable(),f.getBprice(),f.getFtotalseats(),f.getFseatavailable(),
				f.getFprice(),f.getEtotalseats(),f.getEseatavailable(),f.getEprice(),f.getTotalseats(),f.getTotalavailableseats());
	}
	@Override
	public int update(FlightData f) {
		String sql="UPDATE FLIGHT_DATA SET FLIGHT_DETAIL_ID=?, ADMIN_ID=?, FLIGHT_COMPANY=?, FLIGHT_SRC=?,"
				+ "	 FLIGHT_DES=?, TRAVEL_DATE_TIME=?, BUSSINESS_TOTALSEATS=?, BUSSINESS_SEAT_AVAILABLE=?, BUSINESSCLASS_PRICE=?,"
				+ "	FIRSTCLASS_TOTALSEATS=?, FIRST_SEAT_AVAILABLE=?, FIRSTCLASS_PRICE=?, ECONOMYCLASS_TOTALSEATS=?,"
				+ "ECONOMY_SEAT_AVAILABLE=?, ECONOMYCLASS_PRICE=?, TOTAL_NOOFSEATS=?, TOTAL_AVAILABLE_SEATS=? WHERE FLIGHT_ID=?";
		return jdbcTemplate.update(sql, f.getFlightdetailid(),f.getAdminid(),f.getFlightcompany(),f.getFlightsrc(),f.getFlightdesc(),
				f.getTraveldatetime(),f.getBtotalseats(),f.getBseatavailable(),f.getBprice(),f.getFtotalseats(),f.getFseatavailable(),
				f.getFprice(),f.getEtotalseats(),f.getEseatavailable(),f.getEprice(),f.getTotalseats(),f.getTotalavailableseats(),f.getFlightid());
	}

	@Override
	public FlightData get(Integer id) {
		String sql="SELECT * FROM FLIGHT_DATA WHERE FLIGHT_ID="+id;
		ResultSetExtractor<FlightData> extractor=new ResultSetExtractor<FlightData>() {
			@Override
			public FlightData extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					int Flight_ID=rs.getInt("FLIGHT_ID");
					int Flight_Detail_ID=rs.getInt("FLIGHT_DETAIL_ID");
					int Admin_ID=rs.getInt("ADMIN_ID");
					String Flight_Company=rs.getString("FLIGHT_COMPANY");
					String Flight_Src=rs.getString("FLIGHT_SRC");
					String Flight_Desc=rs.getString("FLIGHT_DES");
					Timestamp Travel_Date_Time=rs.getTimestamp("TRAVEL_DATE_TIME");
					int Business_TotalSeats=rs.getInt("BUSSINESS_TOTALSEATS");
					int Business_SeatAvailable=rs.getInt("BUSSINESS_SEAT_AVAILABLE");
					float Business_Price=rs.getFloat("BUSINESSCLASS_PRICE");
					int First_TotalSeats=rs.getInt("FIRSTCLASS_TOTALSEATS");
					int First_SeatAvailable=rs.getInt("FIRST_SEAT_AVAILABLE");
					float First_Price=rs.getFloat("FIRSTCLASS_PRICE");
					int Economy_TotalSeats=rs.getInt("ECONOMYCLASS_TOTALSEATS");
					int Economy_SeatAvailable=rs.getInt("ECONOMY_SEAT_AVAILABLE");
					float Economy_Price=rs.getFloat("ECONOMYCLASS_PRICE");
					int Total_NoOfSeats=rs.getInt("TOTAL_NOOFSEATS");
					int Total_Available_Seats=rs.getInt("TOTAL_AVAILABLE_SEATS");
					return new FlightData(Flight_ID, Flight_Detail_ID, Admin_ID, Flight_Company, Flight_Src, Flight_Desc, Travel_Date_Time, Business_TotalSeats, Business_SeatAvailable, Business_Price, First_TotalSeats, First_SeatAvailable, First_Price, Economy_TotalSeats, Economy_SeatAvailable, Economy_Price, Total_NoOfSeats, Total_Available_Seats);
				}
				return null;
			}
		};
		return jdbcTemplate.query(sql, extractor);
	}

	@Override
	public int delete(Integer id) {
		String sql="DELETE FROM FLIGHT_DATA WHERE FLIGHT_ID="+id;
		return jdbcTemplate.update(sql);
	}
	
	@Override
	public List<FlightData> list() {
		String sql="SELECT * FROM FLIGHT_DATA";
		RowMapper<FlightData> rowMapper=new RowMapper<FlightData>() {
		@Override
		public FlightData mapRow(ResultSet rs, int rowNum) throws SQLException {
			int Flight_ID=rs.getInt("FLIGHT_ID");
			int Flight_Detail_ID=rs.getInt("FLIGHT_DETAIL_ID");
			int Admin_ID=rs.getInt("ADMIN_ID");
			String Flight_Company=rs.getString("FLIGHT_COMPANY");
			String Flight_Src=rs.getString("FLIGHT_SRC");
			String Flight_Desc=rs.getString("FLIGHT_DES");
			Timestamp Travel_Date_Time=rs.getTimestamp("TRAVEL_DATE_TIME");
			int Business_TotalSeats=rs.getInt("BUSSINESS_TOTALSEATS");
			int Business_SeatAvailable=rs.getInt("BUSSINESS_SEAT_AVAILABLE");
			float Business_Price=rs.getFloat("BUSINESSCLASS_PRICE");
			int First_TotalSeats=rs.getInt("FIRSTCLASS_TOTALSEATS");
			int First_SeatAvailable=rs.getInt("FIRST_SEAT_AVAILABLE");
			float First_Price=rs.getFloat("FIRSTCLASS_PRICE");
			int Economy_TotalSeats=rs.getInt("ECONOMYCLASS_TOTALSEATS");
			int Economy_SeatAvailable=rs.getInt("ECONOMY_SEAT_AVAILABLE");
			float Economy_Price=rs.getFloat("ECONOMYCLASS_PRICE");
			int Total_NoOfSeats=rs.getInt("TOTAL_NOOFSEATS");
			int Total_Available_Seats=rs.getInt("TOTAL_AVAILABLE_SEATS");
 			return new  FlightData(Flight_ID, Flight_Detail_ID, Admin_ID, Flight_Company, Flight_Src, Flight_Desc, Travel_Date_Time, Business_TotalSeats, Business_SeatAvailable, Business_Price, First_TotalSeats, First_SeatAvailable, First_Price, Economy_TotalSeats, Economy_SeatAvailable, Economy_Price, Total_NoOfSeats, Total_Available_Seats);
		}
	
	};
	return  jdbcTemplate.query(sql, rowMapper);
	 
}
}
