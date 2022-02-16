package com.inventory.app.assignment.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity(name = "item")
public class Item {
	
	@Column(name = "itemid")
	@Id
	private int itemid;
	
	@Column(name = "itemDescription")
	private String itemDescription;
	
	@Column(name = "itemcategory")
	private String itemcategory;
	
	@Column(name = "itemtype")
	private String itemtype;
	
	@Column(name = "itemstatus")
	private String itemstatus;
	
	@Column(name = "itemprice")
	private int itemprice;
	
	@Column(name = "itempickupAllowed")
	private boolean itempickupAllowed;
	
	@Column(name = "itemshippingAllowed")
	private boolean itemshippingAllowed;
	
	@Column(name =  "itemdeliveryAllowed")
	private boolean itemdeliveryAllowed;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
    //constructors using fields
	public Item(int itemid, String itemDescription, String itemcategory, String itemtype, String itemstatus, int itemprice,
			boolean itempickupAllowed, boolean itemshippingAllowed, boolean itemdeliveryAllowed) {
		super();
		this.itemid = itemid;
		this.itemDescription = itemDescription;
		this.itemcategory = itemcategory;
		this.itemtype = itemtype;
		this.itemstatus = itemstatus;
		this.itemprice = itemprice;
		this.itempickupAllowed = itempickupAllowed;
		this.itemshippingAllowed = itemshippingAllowed;
		this.itemdeliveryAllowed = itemdeliveryAllowed;
	}
    
	
	//Getter and setters
	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemCategory() {
		return itemcategory;
	}

	public void setItemCategory(String itemcategory) {
		this.itemcategory = itemcategory;
	}

	public String getItemType() {
		return itemtype;
	}

	public void setItemType(String itemtype) {
		this.itemtype = itemtype;
	}

	public String getItemStatus() {
		return itemstatus;
	}

	public void setItemStatus(String itemstatus) {
		this.itemstatus = itemstatus;
	}

	public int getItemPrice() {
		return itemprice;
	}

	public void setItemPrice(int itemprice) {
		this.itemprice = itemprice;
	}

	public boolean isItemPickupAllowed() {
		return itempickupAllowed;
	}

	public void setItemPickupAllowed(boolean itempickupAllowed) {
		this.itempickupAllowed = itempickupAllowed;
	}

	public boolean isItemShippingAllowed() {
		return itemshippingAllowed;
	}

	public void setItemShippingAllowed(boolean itemshippingAllowed) {
		this.itemshippingAllowed = itemshippingAllowed;
	}

	public boolean isItemDeliveryAllowed() {
		return itemdeliveryAllowed;
	}

	public void setItemDeliveryAllowed(boolean itemdeliveryAllowed) {
		this.itemdeliveryAllowed = itemdeliveryAllowed;
	}
	
	
}