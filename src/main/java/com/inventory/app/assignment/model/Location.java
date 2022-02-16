package com.inventory.app.assignment.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


	
	@Entity(name = "location")
	public class Location {
		
		@Column(name = "locationid")
		@Id
		private int locationid;
		
		@Column(name = "locationDesc")
		private String locationDesc;
		
		@Column(name = "locationType")
		private String locationType;
		
		@Column(name = "locationpickupAllowed")
		private boolean locationpickupAllowed;
		
		@Column(name = "locationshippingAllowed")
		private boolean locationshippingAllowed;
		
		@Column(name =  "locationdeliveryAllowed")
		private boolean locationdeliveryAllowed;
		
		@Column(name =  "locationaddressline1")
		private String locationaddressline1;
		
		@Column(name =  "locationaddressline2")
		private String locationaddressline2;
		
		@Column(name =  "locationaddressline3")
		private String locationaddressline3;
		
		@Column(name =  "locationcity")
		private String locationcity;
		
		@Column(name =  "locationstate")
		private String locationstate;
		
		@Column(name =  "locationcountry")
		private String locationcountry;
		
		@Column(name =  "locationpincode")
		private int locationpincode;

	    //@OneToMany (cascade=CascadeType.ALL,mappedBy = "location")
	    //private List<Supply> supply;

	    //@OneToMany (cascade=CascadeType.ALL,mappedBy = "location")
	    //private List<Demand> demand;
	
		
        //constructors from super class
		public Location() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	
        //Constructors using fields
		public Location(int locationid, String locationDesc, String locationType,
				boolean locationpickupAllowed, boolean locationshippingAllowed, boolean locationdeliveryAllowed,
				String locationaddressline1, String locationaddressline2, String locationaddressline3,
				String locationcity, String locationstate, String locationcountry, int locationpincode) {
			super();
			this.locationid = locationid;
			this.locationDesc = locationDesc;
			this.locationType = locationType;
			this.locationpickupAllowed = locationpickupAllowed;
			this.locationshippingAllowed = locationshippingAllowed;
			this.locationdeliveryAllowed = locationdeliveryAllowed;
			this.locationaddressline1 = locationaddressline1;
			this.locationaddressline2 = locationaddressline2;
			this.locationaddressline3 = locationaddressline3;
			this.locationcity = locationcity;
			this.locationstate = locationstate;
			this.locationcountry = locationcountry;
			this.locationpincode = locationpincode;
		}
        
		
		//Getter and setters
		public int getLocationid() {
			return locationid;
		}

		public void setLocationid(int locationid) {
			this.locationid = locationid;
		}

		public String getLocationDesc() {
			return locationDesc;
		}

		public void setLocationDesc(String locationDesc) {
			this.locationDesc = locationDesc;
		}

		public String getLocationType() {
			return locationType;
		}

		public void setLocationType(String locationType) {
			this.locationType = locationType;
		}

		public boolean isLocationpickupAllowed() {
			return locationpickupAllowed;
		}

		public void setLocationpickupAllowed(boolean locationpickupAllowed) {
			this.locationpickupAllowed = locationpickupAllowed;
		}

		public boolean isLocationshippingAllowed() {
			return locationshippingAllowed;
		}

		public void setLocationshippingAllowed(boolean locationshippingAllowed) {
			this.locationshippingAllowed = locationshippingAllowed;
		}

		public boolean isLocationdeliveryAllowed() {
			return locationdeliveryAllowed;
		}

		public void setLocationdeliveryAllowed(boolean locationdeliveryAllowed) {
			this.locationdeliveryAllowed = locationdeliveryAllowed;
		}

		public String getLocationaddressline1() {
			return locationaddressline1;
		}

		public void setLocationaddressline1(String locationaddressline1) {
			this.locationaddressline1 = locationaddressline1;
		}

		public String getLocationaddressline2() {
			return locationaddressline2;
		}

		public void setLocationaddressline2(String locationaddressline2) {
			this.locationaddressline2 = locationaddressline2;
		}

		public String getLocationaddressline3() {
			return locationaddressline3;
		}

		public void setLocationaddressline3(String locationaddressline3) {
			this.locationaddressline3 = locationaddressline3;
		}

		public String getLocationcity() {
			return locationcity;
		}

		public void setLocationcity(String locationcity) {
			this.locationcity = locationcity;
		}

		public String getLocationstate() {
			return locationstate;
		}

		public void setLocationstate(String locationstate) {
			this.locationstate = locationstate;
		}

		public String getLocationcountry() {
			return locationcountry;
		}

		public void setLocationcountry(String locationcountry) {
			this.locationcountry = locationcountry;
		}

		public int getLocationpincode() {
			return locationpincode;
		}

		public void setLocationpincode(int locationpincode) {
			this.locationpincode = locationpincode;
		}
		
		
		
		

}
