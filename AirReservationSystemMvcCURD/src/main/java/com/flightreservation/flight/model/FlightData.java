package com.flightreservation.flight.model;

import java.sql.Timestamp;

public class FlightData {
	private int flightid;
	private int flightdetailid;
	private int adminid;
	private String flightcompany;
	private String flightsrc;
	private String flightdesc;
	private Timestamp traveldatetime;
	private int btotalseats;
	private int bseatavailable;
	private float bprice;
	private int ftotalseats;
	private int fseatavailable;
	private float fprice;
	private int etotalseats;
	private int eseatavailable;
	private float eprice;
	private int totalseats;
	private int totalavailableseats;
	public FlightData() {
		
	}


	@Override
	public String toString() {
		return "FlightData [flightid=" + flightid + ", flightdetailid=" + flightdetailid + ", adminid=" + adminid
				+ ", flightcompany=" + flightcompany + ", flightsrc=" + flightsrc + ", flightdesc=" + flightdesc
				+ ", traveldatetime=" + traveldatetime + ", btotalseats=" + btotalseats + ", bseatavailable="
				+ bseatavailable + ", bprice=" + bprice + ", ftotalseats=" + ftotalseats + ", fseatavailable="
				+ fseatavailable + ", fprice=" + fprice + ", etotalseats=" + etotalseats + ", eseatavailable="
				+ eseatavailable + ", eprice=" + eprice + ", totalseats=" + totalseats + ", totalavailableseats="
				+ totalavailableseats + "]";
	}


	public FlightData(int flightid, int flightdetailid, int adminid, String flightcompany, String flightsrc,
			String flightdesc, Timestamp traveldatetime, int btotalseats, int bseatavailable, float bprice,
			int ftotalseats, int fseatavailable, float fprice, int etotalseats, int eseatavailable, float eprice,
			int totalseats, int totalavailableseats) { 
		this(flightdetailid, adminid, flightcompany, flightsrc, flightdesc, traveldatetime, btotalseats, bseatavailable,bprice,
				ftotalseats, fseatavailable, fprice, etotalseats, eseatavailable, eprice, totalseats, totalavailableseats);
		this.flightid = flightid;
	}
	
	public FlightData(int flightdetailid, int adminid, String flightcompany, String flightsrc,
			String flightdesc, Timestamp traveldatetime, int btotalseats, int bseatavailable, float bprice,
			int ftotalseats, int fseatavailable, float fprice, int etotalseats, int eseatavailable, float eprice,
			int totalseats, int totalavailableseats) { 
		this.flightdetailid = flightdetailid;
		this.adminid = adminid;
		this.flightcompany = flightcompany;
		this.flightsrc = flightsrc;
		this.flightdesc = flightdesc;
		this.traveldatetime = traveldatetime;
		this.btotalseats = btotalseats;
		this.bseatavailable = bseatavailable;
		this.bprice = bprice;
		this.ftotalseats = ftotalseats;
		this.fseatavailable = fseatavailable;
		this.fprice = fprice;
		this.etotalseats = etotalseats;
		this.eseatavailable = eseatavailable;
		this.eprice = eprice;
		this.totalseats = totalseats;
		this.totalavailableseats = totalavailableseats;
	}


	public int getFlightid() {
		return flightid;
	}


	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}


	public int getFlightdetailid() {
		return flightdetailid;
	}


	public void setFlightdetailid(int flightdetailid) {
		this.flightdetailid = flightdetailid;
	}


	public int getAdminid() {
		return adminid;
	}


	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}


	public String getFlightcompany() {
		return flightcompany;
	}


	public void setFlightcompany(String flightcompany) {
		this.flightcompany = flightcompany;
	}


	public String getFlightsrc() {
		return flightsrc;
	}


	public void setFlightsrc(String flightsrc) {
		this.flightsrc = flightsrc;
	}


	public String getFlightdesc() {
		return flightdesc;
	}


	public void setFlightdesc(String flightdesc) {
		this.flightdesc = flightdesc;
	}


	public Timestamp getTraveldatetime() {
		return traveldatetime;
	}


	public void setTraveldatetime(Timestamp traveldatetime) {
		this.traveldatetime = traveldatetime;
	}


	public int getBtotalseats() {
		return btotalseats;
	}


	public void setBtotalseats(int btotalseats) {
		this.btotalseats = btotalseats;
	}


	public int getBseatavailable() {
		return bseatavailable;
	}


	public void setBseatavailable(int bseatavailable) {
		this.bseatavailable = bseatavailable;
	}


	public float getBprice() {
		return bprice;
	}


	public void setBprice(float bprice) {
		this.bprice = bprice;
	}


	public int getFtotalseats() {
		return ftotalseats;
	}


	public void setFtotalseats(int ftotalseats) {
		this.ftotalseats = ftotalseats;
	}


	public int getFseatavailable() {
		return fseatavailable;
	}


	public void setFseatavailable(int fseatavailable) {
		this.fseatavailable = fseatavailable;
	}


	public float getFprice() {
		return fprice;
	}


	public void setFprice(float fprice) {
		this.fprice = fprice;
	}


	public int getEtotalseats() {
		return etotalseats;
	}


	public void setEtotalseats(int etotalseats) {
		this.etotalseats = etotalseats;
	}


	public int getEseatavailable() {
		return eseatavailable;
	}


	public void setEseatavailable(int eseatavailable) {
		this.eseatavailable = eseatavailable;
	}


	public float getEprice() {
		return eprice;
	}


	public void setEprice(float eprice) {
		this.eprice = eprice;
	}


	public int getTotalseats() {
		return totalseats;
	}


	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}


	public int getTotalavailableseats() {
		return totalavailableseats;
	}


	public void setTotalavailableseats(int totalavailableseats) {
		this.totalavailableseats = totalavailableseats;
	}
 
	
}
