package com.inventory.app.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.inventory.app.assignment.model.Item;
import com.inventory.app.assignment.model.Location;

@Entity(name = "demand")
	public class Demand {
		@Id
		@Column(name = "demandId")
		private int demandId;

		@Column(name = "demandType")
		private String demandType;

		@Column(name = "quantity")
		private int quantity;
		
		@Column(name = "itemid")
		private int itemid;
		
		@Column(name = "locationid")
		private int locationid;

		
		public Demand() {
			super();
			// TODO Auto-generated constructor stub
		}


		@Override
		public String toString() {
			return "Demand [demandId=" + demandId + ", demandType=" + demandType + ", quantity=" + quantity + ", itemid="
					+ itemid+ ", locationid=" + locationid+ "]";
		}


		public Demand(int demandId, String demandType, int quantity, int itemid, int locationid) {
			super();
			this.demandId = demandId;
			this.demandType = demandType;
			this.quantity = quantity;
			this.itemid = itemid;
			this.locationid = locationid;
		}


		public int getDemandId() {
			return demandId;
		}
		
		public void setDemandId(int demandId) {
			this.demandId = demandId;
		}

		public String getDemandType() {
			return demandType;
		}

        public void setDemandType(String demandType) {
			this.demandType = demandType;
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

		public void setItem(int itemid) {
			this.itemid = itemid;
		}

		public int getLocationid() {
			return locationid;
		}

		public void setLocationid(int locationid) {
			this.locationid = locationid;
		}
		
			

}

