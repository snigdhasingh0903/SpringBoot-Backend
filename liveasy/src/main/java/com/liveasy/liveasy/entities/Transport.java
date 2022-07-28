package com.liveasy.liveasy.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transport {

//	"loadingPoint": "delhi",
//	"unloadingPoint": "jaipur",
//	"productType": "chemicals",
//	"truckType": "canter",
//	"noOfTrucks": "1",
//	"weight": "100",
//            optional:"comment": "",
//	“shipperId” : “shipper:<UUID>”,
//	“Date” : “dd-mm-yyyy”
    @Id
    private long loadId;
    private String shipperId;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private int noOfTrucks;
    private long weight;
    private String comment;
    private Date dos;
	public String getShipperId() {
		return shipperId;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getDos() {
		return dos;
	}
	public void setDos(Date dos) {
		this.dos = dos;
	}
	@Override
	public String toString() {
		return "Transport [shipperId=" + shipperId + ", loadingPoint=" + loadingPoint + ", unloadingPoint="
				+ unloadingPoint + ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks="
				+ noOfTrucks + ", weight=" + weight + ", comment=" + comment + ", dos=" + dos + "]";
	}
	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    

}
