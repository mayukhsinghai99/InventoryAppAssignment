package com.inventory.app.assignment.model;

public class Availability {
	
	private int itemid;
	private int locationid;
	private int AvailabeQty;
	
	
	public Availability(int itemid, int locationid, int availabeQty) {
		super();
		this.itemid = itemid;
		this.locationid = locationid;
		this.AvailabeQty = availabeQty;
	}


	public int getItemid() {
		return itemid;
	}


	public void setItemid(int itemid) {
		this.itemid = itemid;
	}


	public int getLocationid() {
		return locationid;
	}


	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}


	public int getAvailabeQty() {
		return AvailabeQty;
	}


	public void setAvailabeQty(int availabeQty) {
		AvailabeQty = availabeQty;
	}


	@Override
	public String toString() {
		return "Availability [itemid=" + itemid + ", locationid=" + locationid + ", AvailabeQty=" + AvailabeQty + "]";
	}
	
	
	
	

}
