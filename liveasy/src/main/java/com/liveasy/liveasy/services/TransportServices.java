package com.liveasy.liveasy.services;

import java.util.ArrayList;
import java.util.List;

import com.liveasy.liveasy.entities.Transport;

public interface TransportServices {
	//List list=new ArrayList<Transport>();
	public  List<Transport> getShipping(String shipperId);
	public Transport getPayload(long payloadId);
	public Transport addPayload(Transport payload);
	public Transport updatePayloadId(long payloadId);
	public void deletePayload(long payloadId);
	

}
