package com.tnsif.inheritance;

public class Citizen {
	private String name;
	private long adharno;
	private String address;
	private long phono;
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Citizen(String name, long adharno, String address, long phono) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.address = address;
		this.phono = phono;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhono() {
		return phono;
	}
	public void setPhono(long phono) {
		this.phono = phono;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharno=" + adharno + ", address=" + address + ", phono=" + phono + "]";
	}
	
	
}
