package com.java.hotelMgmt.core.businessdelegate;

import com.java.hotelMgmt.core.service.GenericService;
import com.java.hotelMgmt.dto.util.GenericDTO;
import com.java.hotelMgmt.util.ServiceLocator;
import com.java.hotelMgmt.valueObject.util.GenericVO;

public class BusinessDelegate {

	public GenericVO doProcess(GenericDTO transferObject) {
		GenericService applicationService = ServiceLocator
				.getService(transferObject.getAction());

		GenericVO valueObject = applicationService.doProcess(transferObject);
		return valueObject;

	}

}
