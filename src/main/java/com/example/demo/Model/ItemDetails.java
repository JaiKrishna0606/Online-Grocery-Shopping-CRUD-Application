package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Itemtable")
public class ItemDetails {
	@Id
	@GeneratedValue
	private int id;
	private String itemname;
	private long price;
	private int quantity;
	private String mfgdate;
	private String expdate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public ItemDetails(int id, String itemname, long price, int quantity, String mfgdate, String expdate) {
		super();
		this.id = id;
		this.itemname = itemname;
		this.price = price;
		this.quantity = quantity;
		this.mfgdate = mfgdate;
		this.expdate = expdate;
	}
	public ItemDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
