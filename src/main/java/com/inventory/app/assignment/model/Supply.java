package com.inventory.app.assignment.model;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity(name = "supply")
public class Supply {
		
		@Column(name = "supplyid")  
		@Id
		private int supplyid;
		
		@Column(name = "supplyType")
		private String supplyType;
		
		@Column(name = "quantity")
		private int quantity;	
		
		@Column(name = "itemid")
		private int itemid;
		
		@Column(name = "locationid")
		private int locationid;
		
		

		public Supply() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Supply(int supplyid, String supplyType, int quantity, int itemid, int locationid) {
			super();
			this.supplyid = supplyid;
			this.supplyType = supplyType;
			this.quantity = quantity;
			this.itemid = itemid;
			this.locationid = locationid;
		}
		
		
		@Override
		public String toString() {
			return "Supply [supplyid=" + supplyid + ", supplyType=" + supplyType + ", quantity=" + quantity + ", itemid="
					+ itemid + ", locationid=" + locationid + "]";
		}
		

		public int getSupplyid() {
			return supplyid;
		}

		public void setSupplyid(int supplyid) {
			this.supplyid = supplyid;
		}

		public String getSupplyType() {
			return supplyType;
		}

		public void setSupplyType(String supplyType) {
			this.supplyType = supplyType;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
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
}

		

		

		
		
