package com.java.hotelMgmt.core.service;

import com.java.hotelMgmt.dto.util.GenericDTO;
import com.java.hotelMgmt.valueObject.util.GenericVO;

public abstract class GenericService {
	
	

	public abstract GenericVO doProcess(GenericDTO genericdto);
	
}
