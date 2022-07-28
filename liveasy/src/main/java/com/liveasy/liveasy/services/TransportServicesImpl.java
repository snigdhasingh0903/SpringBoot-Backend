package com.liveasy.liveasy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.liveasy.liveasy.dao.TransportDao;
import com.liveasy.liveasy.entities.Transport;

@Service
public class TransportServicesImpl implements TransportServices{

 TransportDao pl;
	@Override
   public List<Transport> getShipping(String shipperId) {
	// List l=new ArrayList<Transport>();
     List<Transport> l=pl.findAll();
     List li=new ArrayList<Transport>();
     for(Transport x:l) {
    	 if(x.getShipperId().equals(shipperId)) {
    		 li.add(x);
    	 }
     }
		return li;
	}

	@Override
	public Transport getPayload(long payloadId) {
		
		return pl.getReferenceById(payloadId) ;
	}

	@Override
	public Transport addPayload(Transport payload) {
		pl.save(payload);
		return payload;
	}

	@Override
	public Transport updatePayloadId(long payloadId) {
		Transport t=pl.getReferenceById(payloadId);
		pl.save(t);
		return t;
	}

	@Override
	public void deletePayload(long payloadId) {
		Transport t=pl.getReferenceById(payloadId);
		pl.delete(t);
	}

}
